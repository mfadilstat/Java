package com.config;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public abstract class myconfig {

    private static final String DB_URL = "jdbc:mysql://phpmyadmin.test/db_sisfo";
    private static final String DB_USER = "df_user";
    private static final String DB_PASS = "df";
    
    private static Connection connect;
    private static Statement statement;
    private static ResultSet resultset;

    public static void connection(){
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection success");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection: Gagal");
        }
    }
}