package Inheritance1;

import java.util.Scanner;

class per
{
	int s[];
	float per,sum;

	void calPer(int s[])
	{
		for(int i=0;i<s.length;i++)
		{
			sum = sum+s[i];
		}
		per=sum/s.length;
	}
}
class CSE extends per
{
	String name,address,year;
	int id;
	CSE(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCSE()
	{
		System.out.println("Name\tId\tAddress\tYear\tper");
		System.out.println(name+"\t"+id+"\t"+address+"\t"+year+"\t"+per);
	}
}
class ETC extends per
{
	String name,address,year;
	int id;
	ETC(String name,int id,String address,String year)
	{
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showETC()
	{
		System.out.println("Name\tId\tAddress\tYear\tper");
		System.out.println(name+"\t"+id+"\t"+address+"\t"+year+"\t"+per);
	}
}
public class Engg_result {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 6 subject marks of CSE Student");
		int a[] = new int[6];
		for(int i=0;i<6;i++)
		{
			a[i]= sc.nextInt();
		}
		
		System.out.println("enter 6 subject marks of ETC Student");
		int b[] = new int[6];
		for(int i=0;i<6;i++)
		{
			b[i]= sc.nextInt();
		}
		
		CSE c = new CSE("pranit", 1, "Nagar" , "Ty");
		c.calPer(a);
		c.showCSE();
		
		ETC e = new ETC("Ani", 2, "Pune" , "Sy");
		e.calPer(b);
		e.showETC();
	}
}