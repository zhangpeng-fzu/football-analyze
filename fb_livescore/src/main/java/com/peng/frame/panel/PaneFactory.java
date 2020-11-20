package com.peng.frame.panel;

import com.peng.bean.MatchBean;
import com.peng.bean.MissValueDataBean;
import com.peng.constant.Constants;
import com.peng.constant.MatchStatus;
import com.peng.frame.MCellRenderer;
import com.peng.util.SpringBeanUtils;
import org.springframework.util.CollectionUtils;
import sun.swing.table.DefaultTableCellHeaderRenderer;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public abstract class PaneFactory {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static boolean isUnPlaying(String status) {
        return !MatchStatus.PLAYING.equals(status);
    }

    public static boolean isUnFinished(String status) {
        return !MatchStatus.FINISHED.equals(status);
    }

    public static boolean isCancelled(String status) {
        return MatchStatus.CANCELLED.equals(status);
    }

    protected abstract String[] calcMissValue(MatchBean matchBean, MatchBean nextMatch, String[] curCompareData, String[] lastMissValues, int[] matchCompareCountArr, int[] matchCompareMaxArr, int[] matchCompareMax300Arr) throws ParseException;

    protected abstract void fillTableData(String[] tableDatum, String[] missValues, MatchBean matchBean) throws ParseException;

    protected abstract void fillTodayData(String[] tableDatum, String[] columnNames, String[] curCompareData, int step, int offset) throws ParseException;

    public abstract String[] getColumns(int index, String[] columnNames, int offset, MatchBean matchBean, String[][] tableData, int row);

    public abstract JScrollPane showMatchPaneByDate(Date date) throws ParseException;

    /**
     * 计算统计数据
     *
     * @param row       当前行数
     * @param tableData 表格数据
     * @param countArr  命中次数
     * @param maxArr    最大遗漏值
     * @param max300Arr 最近300最大遗漏值
     * @param step      步长
     * @param offset    偏移量
     */
    public void addStatisticsData(int row, String[][] tableData, int[] countArr, int[] maxArr, int[] max300Arr, int step, int offset) {
        int total = row - 1;
        int size = tableData[0].length;

        tableData[row] = new String[size];
        tableData[row][0] = Constants.TOTAL_MISS;
        for (int i = 0; i < countArr.length; i++) {
            tableData[row][i * step + offset] = String.valueOf(countArr[i]);
        }
        row++;
        tableData[row] = new String[size];

        tableData[row][0] = Constants.AVG_MISS;
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 0) {
                tableData[row][i * step + offset] = String.valueOf(total);
            } else {
                tableData[row][i * step + offset] = String.valueOf(total / countArr[i]);
            }
        }
        if (max300Arr != null) {
            row++;
            tableData[row] = new String[size];
            tableData[row][0] = Constants.MAX_300_MISS;
            for (int i = 0; i < max300Arr.length; i++) {
                tableData[row][i * step + offset] = String.valueOf(max300Arr[i]);
            }
        }


        row++;
        tableData[row] = new String[size];
        tableData[row][0] = Constants.MAX_MISS;
        for (int i = 0; i < maxArr.length; i++) {
            tableData[row][i * step + offset] = String.valueOf(maxArr[i]);
        }
    }

    /**
     * 计算遗漏值
     *
     * @param matchNum   赛事编号
     * @param statistics 是否需要统计数据
     * @param type       统计表格类型
     * @param step       步长
     * @param offset     偏移量
     * @return 遗漏值数据
     * @throws ParseException e
     */
    public MissValueDataBean getMissValueData(String matchNum, boolean statistics, String type, int step, int offset) throws ParseException {
        String[] columnNames = Constants.TABLE_NAME_MAP.get(type)[1];
        String today = DATE_FORMAT.format(new Date());

        int size = columnNames.length;
        int row = 0;
        int statisticsSize = (size - offset) / step;


        List<MatchBean> matchList = Constants.MATCH_CACHE_MAP.getOrDefault(matchNum.split("串")[0], new ArrayList<>()).stream().sorted(Comparator.comparing(MatchBean::getLiveDate)).collect(Collectors.toList());

        if (matchList.stream().noneMatch(matchBean -> today.equals(matchBean.getLiveDate()))) {
            matchList.add(MatchBean.builder().liveDate(today).build());
        }
        //计算最大行数，统计数据占四行
        int maxRow = statistics ? matchList.size() + 4 : matchList.size();

        String[] lastMissValues = new String[size - offset];

        String nextMatchNum = null;
        Map<String, List<MatchBean>> nextMatchListDateMap = new HashMap<>();
        if (matchNum.contains("串")) {
            String[] matchNums = matchNum.split("串");
            matchNum = matchNums[0];
            nextMatchNum = matchNums[1];
            lastMissValues = new String[size - offset + 1];
            nextMatchListDateMap = Constants.MATCH_CACHE_MAP.getOrDefault(nextMatchNum, new ArrayList<>()).stream().collect(Collectors.groupingBy(MatchBean::getLiveDate));
        }
        String[][] tableData = new String[maxRow][lastMissValues.length + offset];


        Arrays.fill(lastMissValues, "0");

        //命中次数
        int[] matchCountArr = new int[statisticsSize];
        //最大遗漏值
        int[] matchMaxArr = new int[statisticsSize];
        //最近300场最大遗漏值
        int[] matchMax300Arr = null;

        for (int index = 0; index < matchList.size(); index++) {
            MatchBean matchBean = matchList.get(index);
            String[] compareData = getColumns(index, columnNames, offset, matchBean, tableData, row);

            //当天的场次 显示空行
            if (matchBean.getLiveDate().equals(today)) {
                tableData[row] = new String[lastMissValues.length + offset];
                fillTodayData(tableData[row], columnNames, compareData, step, offset);
                row++;
                continue;
            }

            MatchBean nextMatch = null;
            if (nextMatchNum != null) {
                List<MatchBean> matchBeans = nextMatchListDateMap.get(matchBean.getLiveDate());
                if (CollectionUtils.isEmpty(matchBeans)) {
                    continue;
                }
                nextMatch = matchBeans.get(0);
            }

            //以前未完成或者已取消的场次
            if (!matchBean.getLiveDate().equals(today) && isUnFinished(matchBean.getStatus())) {
                continue;
            }

            if (matchMax300Arr == null && matchList.size() - index <= 300) {
                matchMax300Arr = new int[statisticsSize];
            }


            //计算遗漏值
            String[] missValues = calcMissValue(matchBean, nextMatch, compareData, lastMissValues, matchCountArr, matchMaxArr, matchMax300Arr);

            //将算出来的遗漏值赋值给上一次的遗漏值
            lastMissValues = missValues;
            tableData[row] = new String[lastMissValues.length + offset];
            fillTableData(tableData[row], missValues, matchBean);
            row++;
        }

        if (statistics) {

            //增加统计数据
            addStatisticsData(row, tableData, matchCountArr, matchMaxArr, matchMax300Arr, step, offset + step - 1);
            row = row + 4;

            Map<String, String[]> maxMiss = Constants.MAX_MISS_VALUE_MAP.getOrDefault(type, new HashMap<>());
            maxMiss.put(matchNum, tableData[row - 1]);
            Constants.MAX_MISS_VALUE_MAP.put(type, maxMiss);

            Map<String, String[]> max300Miss = Constants.MAX_300_MISS_VALUE_MAP.getOrDefault(type, new HashMap<>());
            max300Miss.put(matchNum, tableData[row - 2]);
            Constants.MAX_300_MISS_VALUE_MAP.put(type, max300Miss);

        }
        String[][] newTableData = new String[row][size];
        System.arraycopy(tableData, 0, newTableData, 0, row);
        return MissValueDataBean.builder().missValueData(newTableData).build();
    }


    Integer[] getSortColumn(int size) {
        Integer[] sortColumn = new Integer[size];
        for (int i = 0; i < size; i++) {
            sortColumn[i] = i;
        }
        return sortColumn;
    }

    boolean skipMatchNum(Date date, String matchNum) {
//        return !MatchStatus.MATCH_STATUS_MAP.containsKey(matchNum) ||
//                (DateUtil.isToday(date) && (isUnPlaying(MatchStatus.MATCH_STATUS_MAP.get(matchNum)) || isCancelled(MatchStatus.MATCH_STATUS_MAP.get(matchNum))))
//                || (!DateUtil.isToday(date) && isCancelled(MatchStatus.MATCH_STATUS_MAP.get(matchNum)));
        return false;
    }

    PaneFactory setTableHeader(JTable table) {
        return this.setTableHeader(table, null);
    }

    PaneFactory setTableHeader(JTable table, JFrame jFrame) {
        table.setAutoCreateRowSorter(true);
        table.setRowHeight(25);

        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMinWidth(110);
        DefaultTableCellHeaderRenderer hr = new DefaultTableCellHeaderRenderer();


        if (table.getName() != null && table.getName().startsWith(Constants.COMPARE_TABLE)) {
            if (jFrame != null && jFrame.getWidth() < 1520) {
                table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
                for (int i = 1; i < table.getColumnCount(); i++) {
                    table.getColumnModel().getColumn(i).setPreferredWidth(25);
                }
                table.getTableHeader().setFont(new Font("宋体", Font.PLAIN, 9));
            } else {
                table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            }
        }

        hr.setHorizontalAlignment(JLabel.CENTER);
        table.getTableHeader().setDefaultRenderer(hr);
        return this;
    }

    PaneFactory setTableCell(JTable table) {
        DefaultTableCellRenderer tcr = new MCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, tcr);
        return this;
    }

    void setTableSorter(JTable table, Integer[] columns) {
        final TableRowSorter<TableModel> sorter = new TableRowSorter<>(
                table.getModel());

        for (Integer column : columns) {
            sorter.setComparator(column, (Comparator<String>) (arg0, arg1) -> {
                try {

                    if (String.valueOf(arg0).contains(" ") || String.valueOf(arg0).equals("") || String.valueOf(arg0).equals("0.0") || arg0 == null || arg0.contains(":") || arg0.equals("中")) {
                        arg0 = "0";
                    }
                    if (String.valueOf(arg1).contains(" ") || String.valueOf(arg1).equals("") || String.valueOf(arg1).equals("0.0") || arg1 == null || arg1.contains(":") || arg1.equals("中")) {
                        arg1 = "0";
                    }

                    if (arg0.contains("年") || arg1.contains("年")) {
                        return arg0.compareTo(arg1);
                    }

                    Float a = Float.parseFloat(arg0);
                    Float b = Float.parseFloat(arg1);

                    return a.compareTo(b);
                } catch (NumberFormatException e) {
                    return 0;
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                    return 0;
                }
            });
        }
        table.setRowSorter(sorter);
    }

    PaneFactory setTableClick(JTable table) {
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    mouseSingleClicked(table, e);//执行单击事件
                } catch (ParseException parseException) {
                    parseException.printStackTrace();
                }
            }
        });
        return this;
    }

    private void mouseSingleClicked(JTable table, MouseEvent e) throws ParseException {
        String clickValue = String.valueOf(table.getValueAt(table.rowAtPoint(e.getPoint()), 0));
        Constants.SELECT_MATCH_NUM = clickValue.trim();
        switch (table.getName()) {
            case Constants.NUM_TABLE:
                MatchNumPanelFactory matchNumPanelFactory = SpringBeanUtils.getBean("matchNumPanelFactory");
                assert matchNumPanelFactory != null;

                JFrame innerFrame = new JFrame(clickValue + "详细数据");
                innerFrame.setBounds(400, 50, 800, 900);
                innerFrame.getContentPane().add(matchNumPanelFactory.showMatchPaneByNum(clickValue));
                innerFrame.setVisible(true);
                break;
            case Constants.CASCADE_TABLE:
                MatchCascadePanelFactory matchCascadePanelFactory = SpringBeanUtils.getBean("matchCascadePanelFactory");
                assert matchCascadePanelFactory != null;

                innerFrame = new JFrame(clickValue + "详细数据");
                innerFrame.setBounds(400, 50, 650, 900);
                innerFrame.getContentPane().add(matchCascadePanelFactory.showMatchPaneByNum(clickValue));
                innerFrame.setVisible(true);
                break;
            case Constants.COMPARE_TABLE:
                MatchComparePanelFactory matchComparePanelFactory = SpringBeanUtils.getBean("matchComparePanelFactory");
                assert matchComparePanelFactory != null;

                innerFrame = new JFrame(clickValue + "详细数据");
                innerFrame.setBounds(200, 50, 1520, 900);
                innerFrame.getContentPane().add(matchComparePanelFactory.showMatchPaneByNum(clickValue, innerFrame, null));
                innerFrame.setVisible(true);

                innerFrame.addComponentListener(new ComponentAdapter() {//让窗口响应大小改变事件
                    @Override
                    public void componentResized(ComponentEvent e) {
                        JTable table1 = null;
                        Component[] components = ((JScrollPane) (innerFrame.getContentPane().getComponent(0))).getViewport().getComponents();
                        if (components.length > 0) {
                            table1 = (JTable) components[0];
                        }
                        try {
                            matchComparePanelFactory.showMatchPaneByNum(clickValue, innerFrame, table1);
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }
                    }
                });


                break;
            case Constants.HALF_TABLE:
                MatchHalfPanelFactory matchHalfPanelFactory = SpringBeanUtils.getBean("matchHalfPanelFactory");
                assert matchHalfPanelFactory != null;

                innerFrame = new JFrame(clickValue + "详细数据");
                innerFrame.setBounds(400, 50, 1000, 900);
                innerFrame.getContentPane().add(matchHalfPanelFactory.showMatchPaneByNum(clickValue));
                innerFrame.setVisible(true);
        }
    }


    JScrollPane scrollToBottom(JTable table) {
        JScrollPane sPane = new JScrollPane(table);
        JScrollBar sBar = sPane.getVerticalScrollBar();
        sBar.setValue(sBar.getMaximum());
        sPane.setVerticalScrollBar(sBar);
        int rowCount = table.getRowCount();
        table.getSelectionModel().setSelectionInterval(rowCount - 1, rowCount - 1);
        Rectangle rect = table.getCellRect(rowCount - 1, 0, true);
        table.scrollRectToVisible(rect);
        return sPane;
    }

}
