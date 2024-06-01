package Generics;

import java.util.ArrayList;
import java.util.List;

class employee01
{
	private int id,sal;
	private String name;
	public employee01()
	{
		
	}
	public employee01(int id, String name, int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class PractGen {

	public static void main(String[] args) {
		
		ArrayList<employee01> al = new ArrayList<>();
		al.add(new employee01(1, "Rohan" ,12000));
		al.add(new employee01(2, "Kiran" ,12300));
		al.add(new employee01(4, "Swappy" ,10000));
		
		employee01 e1 = new employee01();
		e1.setId(1);
		e1.setName("mangesh");
		e1.setSal(14000);
		al.add(e1);
		
		for(employee01 e:al)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
	}
}