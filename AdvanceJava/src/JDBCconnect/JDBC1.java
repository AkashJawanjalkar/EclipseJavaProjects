package JDBCconnect;
import java.sql.*;
public class JDBC1 {

	public static void main(String[] args)throws Exception {

		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		
		DriverManager.registerDriver(d);
		
		System.out.println("Driver register successfully");
	}

}
