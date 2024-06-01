package Collection;

import java.util.Scanner;
import java.util.Vector;

public class Student_UD_OC {

	public static void main(String[] args) {
		
//		StudentPer s1 = new StudentPer();
//		s1.setId(1);
//		s1.setName("krishna");
//		s1.setPer(67);
//		StudentPer s2 = new StudentPer("Rushi",2,88);
//		StudentPer s3 = new StudentPer("Ram",3,89);
		
		Vector v = new Vector();
		StudentPer s[] = new StudentPer[3];
		
		for(int i=0;i<s.length;i++)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name, id and percentage");
			String name = sc.nextLine();
			int id = sc.nextInt();
			int sal = sc.nextInt();
			
			s[i]=new StudentPer(name,id,sal);
			v.add(s[i]);
		}
		
		System.out.println("Display student before sort");
		for(Object obj:v)
		{
			StudentPer s1= (StudentPer)obj;
			
			System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getPer());
			
		}
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=(i+1);j<v.size();j++)
			{
				StudentPer s1=(StudentPer)v.get(i);
				StudentPer s2=(StudentPer)v.get(j);
				
				if(s1.getPer()<s2.getPer())
				{
					v.set(i, s2);
					v.set(i, s1);
				}
			}
				
		}
		System.out.println("Display student after sorting");
		for(Object obj:v)
		{
			StudentPer s1=(StudentPer)obj;
			
			System.out.println(s1.getId()+"\t"+s1.getName()+"\t"+s1.getPer());
		}
	}
}