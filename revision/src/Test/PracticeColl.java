package Test;

import java.util.*;

class data
{
	private int id, sal;
	private String name;
	data()
	{
		
	}
	data(int id, String name, int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
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
public class PracticeColl 
{
	public static void main(String[] args) 
	{
		ArrayList<data> al = new ArrayList<data>();
		al.add(new data(1,"mangesh",12000));
		al.add(new data(2,"ram",14000));
		al.add(new data(3,"Ramesh",13000));
		al.add(new data(4,"Swapnil",1700));
		
		Integer sum=0;
		for(data obj:al)
		{
			sum=sum+(int)obj.getSal();
		}
		System.out.println("total sum salary is "+sum);
	}
}