package Generics;

import java.util.ArrayList;

class Employee
{
	private int id,sal;
	private String name;
	public Employee()
	{
		
	}
	public Employee ( int id, String name, int sal)
	{
		this.id=id;
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
public class EmployeeGenerics {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"kiran",12000));
		al.add(new Employee(2,"Rohan",13000));
		al.add(new Employee(3,"Swappy",10000));
		
		int sum =0;
		for(Employee e:al)
		{
			sum=sum+e.getSal();
		}
		System.out.println("sum of all employee salary is "+sum);
	}

}
