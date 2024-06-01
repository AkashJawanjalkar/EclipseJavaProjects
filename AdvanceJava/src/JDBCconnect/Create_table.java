package JDBCconnect;
import java.sql.*;
import java.util.Scanner;
public class Create_table {

	public static void main(String[] args)throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		if(conn!=null)
		{
			System.out.println("Connection succeessfull");
			Statement stt = conn.createStatement();
			int value = stt.executeUpdate("create table CbiJoin(AcNo int(5),foreign key (AcNo)references "
					+ "customer(AcNo), Bid int(5),foreign key (Bid) references bank (Bid), tid int(5),"
					+ "foreign key (tid) references transaction(tid))");
			if(value==0)
			{
				System.out.println("table created");
			}
			else
			{
				System.out.println("table not created");
			}
		}
		else
		{
			System.out.println("Not connected");
		}
	}

}
