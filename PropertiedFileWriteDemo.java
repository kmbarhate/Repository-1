package com.kiran.propertiesmysql.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiedFileWriteDemo {
    public static void main(String args[]) throws IOException {
        Properties properties=new Properties();

        properties.setProperty("classmysql","com.mysql.cj.jdbc.Driver");
        properties.setProperty("mysqlUrl","jdbc:mysql://localhost:3306/kirandb");
        properties.setProperty("mysqlUsername","root");
        properties.setProperty("mysqlPassword","root");
        FileOutputStream fileOutputStream= new FileOutputStream("E:/abc/xyz/db.properties");
        properties.store(fileOutputStream,"MySql parameter by kiran");
        fileOutputStream.close();

    }
}
