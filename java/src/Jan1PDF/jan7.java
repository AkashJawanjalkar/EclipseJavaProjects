package Jan1PDF;

import java.util.Scanner;

class InsertEl
{
	
	Scanner s = new Scanner(System.in);
	int[] a;
	int size;
	
	void setArray(int size,int ...a)
	{
		this.a=a;
		this.size=size;
	}
	void Insert()
	{
		int[] b = new int[size+1];
		System.out.println("Enter Element you want to insert:");
		int Ele = s.nextInt();
		System.out.println("Enter index");
		int Ind = s.nextInt();
		for(int i=0;i<b.length;i++)
		{
			if(i<Ind)
			{
				b[i]=a[i];
			}
			else if(i==Ind)
			{
				b[i]=Ele;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.println("After element Inserting");
		for(int i=0;i<b.length;i++)
		{
				System.out.println(b[i]+"\t");	
		}
	}
}

public class jan7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size;
			System.out.println("enter array size:");
			size = sc.nextInt();
			int a[] = new int[size];
			System.out.println("Enter Array Elements");
			for(int i=0;i<a.length;i++)
			{
				a[i] = sc.nextInt();
			}
			
			InsertEl I = new InsertEl();
			I.setArray(size,a);
			I.Insert();
		}
	}
}