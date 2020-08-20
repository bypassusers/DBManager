package com.smile.database;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {

    public ConnectToDB() throws SQLException {

        try(
                Connection connection = DBCreds.getConnection();
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet results = statement.executeQuery("SELECT * FROM Accounts");

                ) {
            results.last();


        } catch (SQLException e) {
            JOptionPane sqlExceptionError = new JOptionPane("Unexpected MySQL error");

        }

    }

}
