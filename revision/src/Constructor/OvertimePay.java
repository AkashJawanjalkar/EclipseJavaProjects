package Constructor;

import java.util.Scanner;

class Employee
{
	int id,TW,Sal,OT;
	String name;
	Employee(String name, int id, int TW, int Sal, int OT)
	{
		this.name=name;
		this.id=id;
		this.TW=TW;
		this.Sal=Sal;
		this.OT=OT;
	}
	void DisplayInfo()
	{
		System.out.println("name\tid\tTotal Working\tSalary\tOvertime");
		System.out.println(name+"\t"+id+"\t"+TW+"\t\t"+Sal+"\t"+OT);
	}
}
class OverTime
{
	Employee emp[];
	void setEmployee(Employee emp[])
	{
		this.emp=emp;
	}
	void CalOvertime()
	{
		System.out.println("new Updates data:");
		for(int i=0;i<emp.length;i++)
		{
			int newSal = emp[i].OT*50;
			emp[i].Sal = emp[i].Sal + newSal;
			System.out.println("name\tid\tTotal Working\tSalary\tOvertime");
			System.out.println(emp[i].name+"\t"+emp[i].id+"\t"+emp[i].TW+"\t\t"+emp[i].Sal+"\t"+emp[i].OT);
		}
	}
}
public class OvertimePay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,Tw,sal,Ot;
		String name;
		Employee e[] = new Employee[5];
		
		for(int i=0;i<e.length;i++)
		{
		  System.out.println("Enter the name ,id , totalWorking, salary , overtime");
		  name=sc.nextLine();
		  id=sc.nextInt();
		  Tw=sc.nextInt();
		  sal=sc.nextInt();
		  Ot=sc.nextInt();
		  sc.nextLine();
		  e[i]=new Employee(name, id, Tw, sal, Ot);
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].DisplayInfo();
		}
	
		OverTime v = new OverTime();
		v.setEmployee(e);
		v.CalOvertime();
	}
}