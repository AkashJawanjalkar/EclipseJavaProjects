package Jan1PDF;

import java.util.Scanner;

class Student
{
	int Id,per,fees;
	String name;
	void setId(int id)
	{
		this.Id=id;
	}
	int getId()
	{
		return Id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setPer(int per)
	{
		this.per=per;
	}
	int getPer()
	{
		return per;
	}
	void setfees(int fees)
	{
		this.fees=fees;
	}
	int getfees()
	{
		return fees;
	}
	
}
class DiscFees
{
	Student student;
	int DiscFees;
	int Tfees;
	void setData(Student student)
	{
		this.student=student;
	}
	void CheckEligi()
	{
		if(student.getPer()>60)
		{
			DiscFees = (student.getfees()/100)*30;
			Tfees = student.getfees()-DiscFees;
		}
	}
	void Show()
	{
		System.out.println("name\tid\tper\tfees\tDiscFees\tTfees");
		System.out.println(student.getName()+"\t"+student.getId()+"\t"+student.getPer()+"\t"+student.getfees()+"\t"+DiscFees+"\t\t"+Tfees);
	}
}
public class jan10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,per,fees;
		String name;
		System.out.println("Enter name, id, percentage and Total fees of student:");
		name = sc.nextLine();
		id = sc.nextInt();
		per = sc.nextInt();
		fees = sc.nextInt();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setPer(per);
		s.setfees(fees);
		
		DiscFees d = new DiscFees();
		d.setData(s);
		d.CheckEligi();
		d.Show();
		
	}

}
