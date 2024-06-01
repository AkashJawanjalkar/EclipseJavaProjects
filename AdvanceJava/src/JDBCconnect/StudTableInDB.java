package JDBCconnect;
import java.sql.*;
import java.util.Scanner;
public class StudTableInDB {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		System.out.println("Driver registred");
		int ch,result,id, mks, per;
		String name;
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		if(conn!=null)
		{
			System.out.println("Database connected");
			Statement stt = conn.createStatement();
			do
			{
			System.out.println("Enter choice \n1.Insert data\n2.Update Data\n3.Delete Data");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
			System.out.println("Enter id, name, mks, percent");
			id = sc.nextInt();
			name = sc.next();
			mks = sc.nextInt();
			per = sc.nextInt();
			
			
			result = stt.executeUpdate("Insert into studData values("+id+",'"+name+"',"+mks+","+per+")");
			if(result>0)
			{
				System.out.println("Data inserted successfully");
			}
			else
			{
				System.out.println("data not inserted");
			}
			break;
			
			case 2:
				System.out.println("Enter id for update, name, mks, percent");
				id = sc.nextInt();
				name = sc.next();
				mks = sc.nextInt();
				per = sc.nextInt();
				
				result = stt.executeUpdate("update studdata set name='"+name+"' ,mks="+mks+" ,per="+per+" where id ="+id);
				if(result>0)
				{
					System.out.println("Data updated successfully");
				}
				else
				{
					System.out.println("data not updated");
				}
				
				break;
			case 3:
				System.out.println("Enter id for delete");
				int did = sc.nextInt();
				result = stt.executeUpdate("delete from studdata where id= "+did);
				if(result>0)
				{
					System.out.println("Data updated successfully");
				}
				else
				{
					System.out.println("data not updated");
				}
				
				break;
			}
			}
			while(ch<4);
			
		}
		else 
		{
			System.out.println("not connected");
		}	
	}
}