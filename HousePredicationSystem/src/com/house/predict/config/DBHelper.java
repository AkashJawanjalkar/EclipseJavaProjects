package com.house.predict.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBHelper {
	protected DBconfig db= DBconfig.getDBInstance();
	protected Connection conn=DBconfig.getConnection();
	protected PreparedStatement stmt=DBconfig.getPreaparedStatement();
	protected ResultSet rs= DBconfig.getResultSet();

}
