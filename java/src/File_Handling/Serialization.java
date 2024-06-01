package File_Handling;
import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	private int id;
	private String name;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
}
public class Serialization {

	public static void main(String[] args)throws Exception {
		FileOutputStream fin = new FileOutputStream("D:\\sep2023\\seremp.txt");
		ObjectOutputStream out = new ObjectOutputStream(fin);
		
		Employee emp1 =  new Employee();
		emp1.setId(1);
		emp1.setName("ABC");
		emp1.setSal(12000);
		
		out.writeObject(emp1);
		out.close();
		fout.close();
		System.out.println("Data Save success.......");
		
	}

}
