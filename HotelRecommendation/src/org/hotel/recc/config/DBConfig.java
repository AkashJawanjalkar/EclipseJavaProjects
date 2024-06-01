package org.hotel.recc.config;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBConfig {
	
		private static Connection conn;
		private static PreparedStatement pstmt;
		private static ResultSet rs ;
		private static DBConfig db = null;
			
		private DBConfig()
		{
			try
			{
				Properties p = new Properties();
				p.load(PathHelper.fin);
				String driverClassName = p.getProperty("driver.classname");
				String username = p.getProperty("db.username");
				String password = p.getProperty("db.password");
				String url = p.getProperty("db.url");
				
				Class.forName(driverClassName);
				conn =DriverManager.getConnection(url, username, password);
				if(conn!=null)
					{
					System.out.println("Database is connected");
					}
				else
				{
					System.out.println("Database not connected");
				}
			}
			catch(Exception ex)
			{
				System.out.println("Error is "+ ex);
			}
		}
		public static DBConfig getDBInstance1()
		{
			if(db==null)
			{
				db = new DBConfig();
			}
			return db;
		}
		public static Connection getConnection()
		{
			return conn;
		}
		public static PreparedStatement getStatement()
		{
			return pstmt;
		}
		public static ResultSet getResultSet()
		{
			return rs;
		}


}
