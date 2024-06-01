package org.hotel.recc.config;

import java.sql.*;

public class DBHelper {
	protected DBConfig db = DBConfig.getDBInstance1();
	protected Connection conn = DBConfig.getConnection();
	protected PreparedStatement pstmt = DBConfig.getStatement();
	protected ResultSet rs = DBConfig.getResultSet();
	
}
