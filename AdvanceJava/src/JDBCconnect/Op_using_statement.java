package JDBCconnect;
import java.sql.*;
import java.util.Scanner;
public class Op_using_statement {

	public static void main(String[] args)throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		int eid, salary, contact,ch,result ;
		String email, name;
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		if(conn!=null)
		{
			System.out.println("Connection successful.....");
			Statement stt = conn.createStatement();
			
			System.out.println("Enter choice:\n1.Insert data\n2.Display Data\n3.Update data\n4.delete data");
			do
			{
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter id, name, email, sal, contact of employee");
					eid= sc.nextInt();
					name=sc.next();
					email = sc.next();
					salary = sc.nextInt();
					contact =sc.nextInt();
					result= stt.executeUpdate("insert into employee values("+eid+",'"+name+"','"+email+"',"+salary+","+contact+")");
					if(result!=0)
					{
						System.out.println("data inserted succesfully");
					}
					else
					{
						System.out.println("data not inserted");
					}
					break;
				case 2:
					ResultSet rs = stt.executeQuery("select *from employee");
					while(rs.next())
					{
						eid = rs.getInt(1);
						name = rs.getString(2);
						email = rs.getString(3);
						salary = rs.getInt(4);
						contact = rs.getInt(5);
						System.out.println(eid+" "+name+" "+email+" "+salary+" "+contact);
					}
					break;
				case 3:
					System.out.println("Enter id for update data");
					eid= sc.nextInt();
					System.out.println("Enter updated salary");
					salary = sc.nextInt();
					result = stt.executeUpdate("update employee set salary="+salary+"  where eid="+eid);
					if(result!=0)
					{
						System.out.println("data updated succesfully");
					}
					else
					{
						System.out.println("data not updated");
					}
					break;
				case 4:
					System.out.println("Enter id for delete");
					eid= sc.nextInt();
					result=stt.executeUpdate("delete from employee where eid="+eid);
					if(result!=0)
					{
						System.out.println("data deleted succesfully");
					}
					else
					{
						System.out.println("data not deleted");
					}
					break;
				}
			}
			while(ch<5);
		}
		else
		{
			System.out.println("Not connected");
		}			
	}
}