package com.peng.frame;

import com.peng.constant.Constants;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class MCellRenderer extends DefaultTableCellRenderer {


    private static final long serialVersionUID = 7153906866474195499L;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        命中的显示红色
        if (((String.valueOf(value).equals("0") && !table.getName().equals(Constants.COMPARE_DETAIL_TABLE))
                || String.valueOf(value).contains(":") || String.valueOf(value).equals("中"))
                && !table.getColumnName(column).equals("比分")) {
            component.setBackground(Color.RED);
        } else {
            String columnName = String.valueOf(table.getColumnModel().getColumn(column).getHeaderValue());

            if (columnName.equals("零球") || columnName.equals("1球3球") || columnName.equals("2球4球") || columnName.equals("5球6球7球")) {
                component.setBackground(Color.LIGHT_GRAY);
            } else if (columnName.equals("1球2球") || columnName.equals("2球3球") || columnName.equals("3球4球")) {
                component.setBackground(new Color(104, 190, 210));
            } else {
                component.setBackground(Color.WHITE);
            }

            if (table.getName() != null) {
                //底色置灰
                if ((table.getName().startsWith(Constants.COMPARE_TABLE) && columnName.contains("路"))
                        || table.getName().startsWith(Constants.HALF_TABLE) && columnName.contains("/")) {
                    component.setBackground(Color.LIGHT_GRAY);
                }

                //遗漏值达到最大遗漏值的80%，底色改为黄色
                if ((table.getName().equals(Constants.COMPARE_DETAIL_TABLE)) && value != null && String.valueOf(value).length() > 0 && Constants.MAX_MISS_VALUE_MAP.containsKey(Constants.COMPARE_TABLE) && row < table.getRowCount() - 4) {
                    String[] maxMiss = Constants.MAX_MISS_VALUE_MAP.get(Constants.COMPARE_TABLE).get(Constants.SELECT_MATCH_NUM);

                    if (column > 4 && column % 2 == 1 && maxMiss != null && Float.parseFloat(String.valueOf(value)) / Integer.parseInt(maxMiss[column].trim()) >= 0.8) {
                        component.setBackground(Color.ORANGE);
                    }
                }
                if ((table.getName().equals(Constants.COMPARE_TABLE)) && value != null && Constants.MAX_MISS_VALUE_MAP.containsKey(Constants.COMPARE_TABLE) && String.valueOf(value).length() > 0) {

                    String matchNum = String.valueOf(table.getValueAt(row, 0));
                    String[] maxMiss = Constants.MAX_MISS_VALUE_MAP.get(Constants.COMPARE_TABLE).get(matchNum);
                    if (column > 1 && column % 2 == 0 && maxMiss != null && Float.parseFloat(String.valueOf(value)) / Integer.parseInt(maxMiss[column + 3].trim()) >= 0.8) {
                        component.setBackground(Color.ORANGE);
                    }
                }

                //进球分析
                if ((table.getName().equals(Constants.NUM_DETAIL_TABLE)) && value != null && String.valueOf(value).length() > 0 && Constants.MAX_MISS_VALUE_MAP.containsKey(Constants.NUM_TABLE) && row < table.getRowCount() - 4) {
                    String[] maxMiss = Constants.MAX_MISS_VALUE_MAP.get(Constants.NUM_TABLE).get(Constants.SELECT_MATCH_NUM);

                    if (column > 1 && column % 2 == 0 && maxMiss != null && Float.parseFloat(String.valueOf(value)) / Integer.parseInt(maxMiss[column].trim()) >= 0.8) {
                        component.setBackground(Color.ORANGE);
                    }
                }
                if ((table.getName().equals(Constants.NUM_TABLE)) && value != null && String.valueOf(value).length() > 0 && Constants.MAX_MISS_VALUE_MAP.containsKey(Constants.NUM_TABLE)) {

                    String matchNum = String.valueOf(table.getValueAt(row, 0));
                    String[] maxMiss = Constants.MAX_MISS_VALUE_MAP.get(Constants.NUM_TABLE).get(matchNum);
                    if (column > 1 && column % 2 == 0 && maxMiss != null && Float.parseFloat(String.valueOf(value)) / Integer.parseInt(maxMiss[column].trim()) >= 0.8) {
                        component.setBackground(Color.ORANGE);
                    }
                }
            }
        }
        //统计数据加粗
        if (row >= table.getRowCount() - 4 && (String.valueOf(table.getValueAt(row, 0)).equals("出现总次数")
                || String.valueOf(table.getValueAt(row, 0)).equals("平均遗漏值")
                || String.valueOf(table.getValueAt(row, 0)).contains("最大遗漏值"))
        ) {
            component.setFont(new Font("宋体", Font.BOLD, 12));
        }

        return component;
    }

}
