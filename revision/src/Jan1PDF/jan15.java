package Jan1PDF;

import java.util.Scanner;

class Employee
{
	int id,sal;
	String name;
	
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setId(int id)
	{
		this.id=id;
	}
	int getId()
	{
		return id;
	}
	void setSal(int sal)
	{
		this.sal=sal;
	}
	int getSal()
	{
		return sal;
	}
}
public class jan15 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int id,sal;
		String name;
		
		Employee e[] = new Employee[3];
		for(int i = 0; i<3 ;i++)
		{
		e[i] = new Employee(); 
		System.out.println("Enter employee name, Id and salary");
		
		name = sc.nextLine();
		e[i].setName(name);
		
		id = sc.nextInt();
		e[i].setId(id);
		
		sal = sc.nextInt();
		e[i].setSal(sal);
		
		sc.nextLine();
		}
		
		System.out.print("Name\tId\tsalary\n");

		for(int i=0;i<3;i++)
		{
			System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSal());
		}		
	}
}