package Test;

import java.util.Scanner;

class Student
{
	int rollno;
	int mks[] =new int[5];
	String name;
	
	Student(int rollno, String name, int mks[])
	{
		this.rollno=rollno;
		this.name=name;
		this.mks=mks;
	}
	
	boolean pass()
	{
		for(int mks:mks)
		{
			if(mks<40)
			{
				return false;
			}
		}
		return true;
	}
	int getTotal()
	{
		int total=0;
		for(int mks:mks)
		{
			total+=mks;
		}
		return total;
	}
}
public class StudentResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student st[] = new Student[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter student details");
			System.out.println("Enter roll number");
			int rollno = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name = sc.nextLine();
			int mks[] = new int[5];
			System.out.println("enter 5 sub marks:");
			for(int j=0;j<5;j++)
			{
				mks[j]=sc.nextInt();
			}
			st[i] = new Student(rollno,name,mks);
		}
		
		for(int i=0;i<st.length;i++)
		{
			for(int j=0;j<st.length;j++)
			{
				if(st[i].getTotal()<st[j].getTotal())
				{
					Student temp = st[i];
					st[i] = st[j];
					st[j] = temp;
				}
			}
		}
		
		System.out.println("Topper");
		
		for(Student st1:st)
		{
			if(st1.pass())
			{
				System.out.println("Roll no: "+st1.rollno);
				System.out.println("Name: "+st1.name);
				System.out.println("Total marks: "+st1.getTotal());
				break;
			}
		}
	}
}