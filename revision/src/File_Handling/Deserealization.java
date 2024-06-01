package File_Handling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class employee implements Serializable
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
public class Deserealization {

	public static void main(String[] args)throws Exception {
		FileInputStream fin = new FileInputStream("D:\\sep2023\\student.txt");
		ObjectInputStream oinf = new ObjectInputStream(fin);
		Object obj =oinf.readObject();
		if(obj!=null)
		{
			employee e = (employee)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		else
		{
			System.out.println("data not present in file");
		}
	}
}