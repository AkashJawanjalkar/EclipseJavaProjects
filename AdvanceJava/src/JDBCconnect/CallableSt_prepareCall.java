package JDBCconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.CallableStatement;

public class CallableSt_prepareCall {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		if(conn!=null)
		{
			java.sql.CallableStatement stmt = conn.prepareCall("{call saveEmployee(?,?,?,?,?)}");
			stmt.setInt(1, 23);
			stmt.setString(2, "shyam");
			stmt.setString(3, "sm@");
			stmt.setString(4, "812623");
			stmt.setString(5, "24354759");
			boolean b = stmt.execute();
			if(!b)
			{
				System.out.println("procuedure ececuted succeessfully");
			}
			else
			{
				System.out.println("there is some problem");
			}
			
		}
		else
		{
			System.out.println("database is not connected");
		}
	}

}
