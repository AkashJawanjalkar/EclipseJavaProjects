package Object_class;

import java.util.ArrayList;

class Empl1
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
	
	public String toString()
	{
		return "{"+id+","+name+","+sal+"}";
	}
}
public class UserDefinedObject {

	public static void main(String[] args) {
		Empl1 e1 = new Empl1();
		e1.setId(1);
		e1.setName("Ram");
		e1.setSal(13000);
		
		Empl1 e2 = new Empl1();
		e2.setId(2);
		e2.setName("Shyam");
		e2.setSal(15000);
		
		ArrayList<Empl1> al = new ArrayList<Empl1>();
		
		al.add(e1);
		al.add(e2);
		
		System.out.println(al);
	}

}
