package com.bootcoding.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserJdbcExample {
    public static void main(String[] args) {
        try{
            //1.load jdbc driver
            Class.forName("org.postgressql .Driver");
            //2.get database connection object
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "@Shreya10@");

            // 3.

            Statement stm = conn.createStatement();

            //4 .
            ResultSet rs = stm.executeQuery("SELECT + FROM  users");
            //5connection class
            conn.close();{
                  
            }
        }

        catch (Exception ex){

        }
    }
}
