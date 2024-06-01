package Constructor;

import java.util.Scanner;

class UI
{
	int a[],b[];
	int Dup;
	int Un[] = new int[6];
	UI(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	void CheckUnion()
	{
		for(int i=0;i<a.length;i++)
		{
			Un[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			Un[i+a.length]=b[i];
		}
		for(int i=0;i<Un.length;i++)
		{
			for(int j=0;j<Un.length;j++)
			{
				if(Un[i]<Un[j])
				{
					int t = Un[i];
					Un[i] = Un[j];
					Un[j] = t;
				}
			}
		}
		System.out.println("Union Array is: ");
		for(int i=0;i<Un.length;i++)
		{
			Dup=0;
			for(int j=0;j<i;j++)
			{
				if(Un[i]==Un[j])
				{
				Dup=1;
				break;
				}
			}
			if(Dup==0)
			{
				System.out.println(Un[i]+"\t");
			}
		}
	}
	void CheckInt()
	{
		int Dup,k=0;
		int z[] = new int[3];
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("Intersections Array is: ");
		for(int i=0;i<a.length;i++)
		{
			Dup=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
				 Dup++;
				 break;
				}
			}
			if(Dup==0)
			{
				z[k++]=a[i];
			}
		}
		for(int i=0;i<k;i++)
		{
		System.out.println(z[i]);
		}
//			if(z[i]==b[i])
//			{
//				for (int j = 0; j <k; ++j)
//					{
//					System.out.println(z[i] + "\t");
//					}
//			}
		}
//		System.out.println("Intersection Array is");
//		int inter[] = new int[3];
//		 int k=0;
//		for(int i1=0;i1<a.length;i1++)
//		{
//			for(int j=0;j<b.length;j++)
//			{
//				if(a[i1]==b[j])
//				{
//					System.out.println(a[i1] + "\t");
//				}
//			}
//		}
//		if(k>0)
//		{
//			for (int i1 = 0; i1 <k; ++i1)
//		    {
//				System.out.println(inter[i1] + "\t");
//		    }
//		}
		
	}

public class Union_Intersection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		
		System.out.println("Enter 3 Emplenet for A");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 3 Emplenet for B");
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		UI u = new UI(a,b);
		u.CheckUnion();
		u.CheckInt();
	}
}
//a[]= {1 2 3 4 5 }
//b[]= {6 2 4 7 8 9}
//
//union= 1 2 3 4 5 6 7 8 9 
//inter-2 3 4