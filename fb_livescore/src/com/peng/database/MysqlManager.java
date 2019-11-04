package com.peng.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlManager {

    // MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/livescore?characterEncoding=utf8";
    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "root";
    private static final String PASS = "root";
    private static Connection connForCascade;
    private static Connection connForNum;
    private static Connection conn;

    static {
        try {
            Class.forName(JDBC_DRIVER);
            // 打开链接
            connForCascade = DriverManager.getConnection(DB_URL, USER, PASS);
            connForNum = DriverManager.getConnection(DB_URL, USER, PASS);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnForCascade() {
        return connForCascade;
    }

    public static Connection getConnForNum() {
        return connForNum;
    }

    public static Connection getConn() {
        return conn;
    }
}
