package com.house.predict.config;
import java.sql.*;

public class DBHelper {
	protected DBconfig db= DBconfig.getDBInstance();
	protected Connection conn=DBconfig.getConnection();
	protected PreparedStatement stmt=DBconfig.getPreaparedStatement();
	protected ResultSet rs= DBconfig.getResultSet();
	
}
