package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.lang.*;

class Employeec implements Comparable
{
	private int id, sal;
	private String name;
	public Employeec()
	{
		
	}
	public Employeec(int id, String name, int sal)
	{
		this.id=id;
		this.name= name;
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
	
	public int compareTo(Object o) {
		Employeec e =(Employeec)o;
		if(this.id>e.id)
		{
			return 1;
		}
		else if(this.id<e.id)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}

public class Comparable_Interface1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		Employeec e1 = new Employeec();
		e1.setId(5);
		e1.setName("Ram");
		e1.setSal(12000);
		al.add(e1);
		
		Employeec e2 = new Employeec(2,"Ramesh",13000);
		al.add(e2);
		
		al.add(new Employeec(3,"Shyam",12500));
		Employeec e4 = new Employeec(4,"Ghanshyam",10000);
		al.add(e4);
		
		al.add(new Employeec(1,"Kiran",12345));
		
		System.out.println("Before Sort");
		for(Object obj:al)
		{
			Employeec e =(Employeec)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
		}
		
		Collections.sort(al);
		System.out.println("after sort");
		for(Object obj:al)
		{
			Employeec e =(Employeec)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());

		}
	}
}