package JDBCconnect;
import java.sql.*;
import java.util.*;
public class Bank_project {

	public static void main(String[] args)throws SQLException {
		Scanner sc = new Scanner(System.in);
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		
		int result, ch, Acno, balance, Bid, IFSC_code, Tid,dep;
		String name, email, contact, address, BankName, TName, Date;
		
		if(conn!=null)
		{
			System.out.println("Connected");
			
			System.out.println("Enter choice:\n1.Add bank Cust\n2.view All cust\n3.Update Cust\n4.delete cust"
					+ "\n5.Deposite money\n6.withdraw money\n7.view statement\n8.check balance");
			do
			{
				ch = sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("Enter acNo, name, email, contact, address, balance of customer");
					Acno = sc.nextInt();
					name = sc.next();
					email = sc.next();
					contact = sc.next();
					address = sc.next();
					balance = sc.nextInt();
					Statement stt = conn.createStatement();
					result = stt.executeUpdate("insert into customer values("+Acno+", '"+name+"', '"+email+"', '"+contact+"', '"+address+"',"+balance+")");
					if(result!=0)
						System.out.println("cusomer added successfully....");
					else
						System.out.println("cstomer not added please check details ...");
					break;
				case 2:
					PreparedStatement pst = conn.prepareStatement("Select *from customer");
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						Acno = rs.getInt(1);
						name = rs.getString(2);
						email = rs.getString(3);
						contact = rs.getString(4);
						address = rs.getString(5);
						balance = rs.getInt(6);
						System.out.println(Acno+"\t"+name+"\t"+email+"\t"+contact+"\t"+address+"\t"+balance);
					}
					break;
				case 3:
					stt = conn.createStatement();
					System.out.println("Enter AcNo for update");
					Acno = sc.nextInt();
					System.out.println("Enter new name, address and balace");
					name = sc.next();
					address = sc.next();
					balance = sc.nextInt();
					result = stt.executeUpdate("update customer set name='"+name+"', address='"+address+"', balance="+balance+" where Acno="+Acno);
					if(result!=0)
						System.out.println("cusomer updated successfully....");
					else
						System.out.println("cstomer not updated please check details ...");
					break;
				case 4:
					stt = conn.createStatement();
					System.out.println("Enter AcNo for delete customer");
					Acno = sc.nextInt();
					result = stt.executeUpdate("delete from customer where Acno="+Acno);
					if(result!=0)
						System.out.println("cusomer deleted successfully....");
					else
						System.out.println("cstomer not deleted please check details ...");
					break;
				case 5:
					stt = conn.createStatement();
					System.out.println("Enter Acno & amount for deposit");
					Acno = sc.nextInt();
					//dep = sc.nextInt();
					result = stt.executeUpdate("select amount from customer where Acno="+Acno);
					if(result!=0)
					break;
				case 6:
					stt = conn.createStatement();
					System.out.println("Enter Acno & amount for withdraw");
					//dep = sc.nextInt();
					Acno = sc.nextInt();
					rs = stt.executeQuery("select amount from customer where Acno="+Acno);
					if(rs!=null)
					break;
				case 7:
					stt = conn.createStatement();
					rs = stt.executeQuery("select Tid, date from Transaction");
					break;
				case 8:
					stt = conn.createStatement();
					System.out.println("Enteer cc number for check balance");
					Acno = sc.nextInt();
					rs = stt.executeQuery("select balance from customer where Acno="+Acno);
					break;
				}
			}
			while(ch<9);
			
		}
		else
		{
			System.out.println("Not connected");
		}
	}
}