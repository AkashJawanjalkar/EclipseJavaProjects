package JDBCconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import com.mysql.cj.conf.ConnectionUrl.Type;
import com.mysql.cj.jdbc.CallableStatement;

public class CallSt_InOutput {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		if(conn!=null)
		{
			java.sql.CallableStatement cstmt = conn.prepareCall("{call getEmpSal(?,?)}");
			cstmt.setString(1, "Ajay");
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();
			System.out.println(cstmt.getInt(2));
		}
		else
		{
			System.out.println("not connected");
		}
	}
} 