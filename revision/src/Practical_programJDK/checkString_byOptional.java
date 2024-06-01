package Practical_programJDK;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import Exception_handling.InputMismatchException;

class Employee
{
	private int id;
	private String name;
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
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
	
}
public class checkString_byOptional 
{
	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<Employee>();
		Employee emp[]  = new Employee[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			
			
			System.out.println("Enter name and id of employee");
			String name = sc.nextLine();
			
			int id = sc.nextInt();
			
			sc.nextLine();
			emp[i]=new Employee(id,name);
			list.add(emp[i]);
		}
		
		Comparator<Employee> c = new Comparator<Employee>()
		{
			public int compare(Employee o1, Employee o2)
			{
				if(o1.getId()>o2.getId())
				{
					return 1;
				}
				else if(o1.getId()<o2.getId())
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		};
		
		System.out.println("Before sort");
		list.forEach((e)->System.out.println(e.getId()+" "+e.getName()));
		
	}
	
}