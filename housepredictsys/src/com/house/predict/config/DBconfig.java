package com.house.predict.config;
import java.util.*;
import java.sql.*;
import java.io.*;
public class DBconfig {
	private static Connection conn;
	private static PreparedStatement stmt;
	private static ResultSet rs;
	private static DBconfig db= null;
	private DBconfig() {
		try {
			Properties p= new Properties();
			p.load(PathHelper.fin);
			String driverClassName= p.getProperty("driver.classname");
			String username=p.getProperty("db.username");
			String password=p.getProperty("db.password");
			String url=p.getProperty("db.url");
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url,username,password); 
			if(conn!=null) {
				System.out.println("Database connection Successfull..");
			}
			else
				System.out.println("Database Connection Unsuccessfull...");
			
		}
		catch(Exception e) {
			System.out.println("Error in :"+e);
		}
	}
	public static DBconfig getDBInstance() {
		if(db==null)
			db= new DBconfig();
		return db;
	}
	public static Connection getConnection() {
		return conn;
	}
	public static PreparedStatement getPreaparedStatement() {
		return stmt;
	}
	public static ResultSet getResultSet() {
		return rs;
	}
}
 