package JDBCconnect;
import java.sql.*;
import java.util.*;
import java.util.Scanner;
public class Op_using_preparedStatement {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		int sid, result,ch;
		String name, email, contact, address;
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		if(conn!=null)
		{
			System.out.println("connected");
			System.out.println("Enter choice\n1,insert record\n2.Display record\n3.Display only name, email &"
					+ "contact\n4.Display distinct names\n5.delete student id 1\n6.delete sid 4 & name=ram\n"
					+ "7.update sid 1 & name shyam\n8.update name, email, contact of eid 1");
			do
			{
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter student id, name, email, contact, address");
					sid= sc.nextInt();
					name = sc.next();
					email = sc.next();
					contact = sc.next();
					address = sc.next();
					
					PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?,?,?)");
					pst.setInt(1, sid);
					pst.setString(2, name);
					pst.setString(3, email);
					pst.setString(4, contact);
					pst.setString(5, address);
				result = pst.executeUpdate();
				if(result!=0)
				{
					System.out.println("data inserted successfully");
				}
				else
				{
					System.out.println("data not inserted");
				}
					
				break;
				case 2:
					pst= conn.prepareStatement("select *from student");
					ResultSet rs =pst.executeQuery();
					while(rs.next())
					{
						sid = rs.getInt(1);
						name = rs.getString(2);
						email = rs.getString(3);
						contact = rs.getString(4);
						address = rs.getString(5);
						System.out.println(sid+" "+name+" "+email+" "+contact+" "+address);
					}
					break;
				case 3:
					pst = conn.prepareStatement("select name, email, contact from student");
					rs = pst.executeQuery();
					while(rs.next())
					{
						name = rs.getString(1);
						email = rs.getString(2);
						contact = rs.getString(3);
						System.out.println(name+" "+email+" "+contact);
					}
					break;
				case 4:
					pst = conn.prepareStatement("select distinct name from student");
					rs = pst.executeQuery();
					while(rs.next())
					{
						name = rs.getString(1);
						System.out.println(name+"\n");
					}
					break;
				case 5:
					System.out.println("Enter id for delete");
					sid = sc.nextInt();
					pst = conn.prepareStatement("delete from student where sid=?");
					pst.setInt(1, sid);
					result = pst.executeUpdate();
					if(result!=0)
					{
						System.out.println("deleted succesfully...");
					}
					else
					{
						System.out.println("not deleted....");
					}
					break;
				case 6:
					System.out.println("Enter sid and name of studnet for delete");
					sid = sc.nextInt();
					name=sc.next();
					pst = conn.prepareStatement("delete from student where name=? or sid=?");
					
					pst.setString(1, name);
					pst.setInt(2, sid);
					result =  pst.executeUpdate();
					
					if(result!=0)
					{
						System.out.println("deleted succesfully...");
					}
					else
					{
						System.out.println("not deleted....");
					}
					break;
				case 7:
					System.out.println("Enter sid and name for update");
					sid= sc.nextInt();
					name= sc.next();
					System.out.println("Enter new email and contact");
					email=sc.next();
					contact=sc.next();
					pst = conn.prepareStatement("update student set contact=?, email=? where name=? and sid=?");
					pst.setInt(4, sid);
					pst.setString(3,name);
					pst.setString(2, email);
					pst.setString(1, contact);
					
					result = pst.executeUpdate();
					if(result>0)
					{
						System.out.println("updated  succesfully...");
					}
					else
					{
						System.out.println("not updated....");
					}
					break;
				case 8:
					System.out.println("Enter name, email and contact for update");
					sid=6;
					name= sc.next();
					email = sc.next();
					contact = sc.next();
					pst = conn.prepareStatement("update student set name=?, email=?, contact=?  where sid=?");
					pst.setInt(1, sid);
					pst.setString(2, name);
					pst.setString(3, email);
					pst.setString(4, contact);
					result = pst.executeUpdate();
					if(result!=0)
					{
						System.out.println("updated succesfully...");
					}
					else
					{
						System.out.println("not updated....");
					}
					break;
				}
			}
			while(ch<9);
		}
		else
		{
			System.out.println("not connected");
		}	
	}
}