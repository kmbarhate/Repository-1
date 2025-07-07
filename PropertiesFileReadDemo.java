package com.kiran.propertiesmysql.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Stack;

public class PropertiesFileReadDemo {
    public static void main(String args[]) throws IOException, SQLException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("E:/abc/xyz/db.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        properties.getProperty("classmysql");
        properties.getProperty("mysqlUsername");
        properties.getProperty("mysqlPassword");
        properties.getProperty("mysqlUrl");

        Class.forName(properties.getProperty("classmysql"));
        System.out.println("class is loaded");
        Connection connection = DriverManager.getConnection(properties.getProperty("mysqlUrl"), properties.getProperty("mysqlUsername"), properties.getProperty("mysqlPassword"));
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from emp1");
        System.out.println("eno\tename\tesal\t\teaddr");
        System.out.println("________________________________");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t\t" + resultSet.getFloat(3) + "\t\t" + resultSet.getString(4));

        }
        fileInputStream.close();

    }
}
