package com.smile.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCreds {
    private static final String DBUSER = "smile";
    private static final String DBPASSWD = "Password";
    private static final String CONNECTOR = "jdbc:mysql://192.168.1.230/Accounts";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONNECTOR, DBUSER, DBPASSWD );
    }
}

