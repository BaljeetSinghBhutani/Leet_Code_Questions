package com.codewithLeetCode;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverConnection {
    public static void main(String[] args) throws SQLException {
//        local host - or look back address 127.0.0.1
      Connection connection =    DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "ayan@123");
        Statement  statement = connection.createStatement();
        statement.execute("create table baljeet(id int , name varchar(30)) ");




    }
}
