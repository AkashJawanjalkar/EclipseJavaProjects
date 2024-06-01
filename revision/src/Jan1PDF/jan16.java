package Jan1PDF;

import java.util.Scanner;

class Employe
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
public class jan16 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int id,sal;
		String name;
		
		Employe e[] = new Employe[3];
		for(int i=0;i<3;i++)
		{
			e[i]= new Employe();
			System.out.println("Enter name, id and salary of employee");
			name = sc.nextLine();
			e[i].setName(name);
			
			id = sc.nextInt();
			e[i].setId(id);
			
			sal = sc.nextInt();
			e[i].setSal(sal);
			
			sc.nextLine();
		}
		
		//System.out.println("Sorting salary in ascending order:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(e[i].getSal()<e[j].getSal())
				{
				Employe t = e[i];
				e[i]= e[j];
				e[j] = t;
				}
			}
		}
		System.out.println("After Sorting salary in ascending order");
		System.out.println("name\tid\tsalary\n\n");
		for(int i=0;i<3;i++)
		{
			System.out.println(e[i].getName()+"\t"+e[i].getId()+"\t"+e[i].getSal()+"\n" );
		}
		
	}
}
