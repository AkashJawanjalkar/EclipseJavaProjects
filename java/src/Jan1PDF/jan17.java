package Jan1PDF;

import java.util.Scanner;

class Employee1
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
}
public class jan17 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int id, sal,dId;
	String name;
	
	Employee1 e[] = new Employee1[3];
	for(int i=0;i<3;i++)
	{
		e[i] = new Employee1();
		System.out.println("Enter name, id and salary:");
		name = sc.nextLine();
		e[i].setName(name);
		
		id = sc.nextInt();
		e[i].setId(id);
		
		sal = sc.nextInt();
		e[i].setSal(sal);
		
		sc.nextLine();
	}
	System.out.println("name\tid\tsalary");
	for(int i=0;i<3;i++)
	{
		System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSal());
	}
	System.out.println("Enter id you want to delete");
	dId = sc.nextInt();
	
	System.out.println("After deleting that id:\n");
	for(int i=0;i<2;i++)
	{
		if(dId==e[i].getId())
		{
			e[i]=e[i+1];
			System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSal());
//			e[i]=e[i-1];
		}
		else
		{
			System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSal());	
		}
	}
	}

}
