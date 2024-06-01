package Constructor;

import java.util.Scanner;

class Mejo
{
		int a[];
	Mejo(int a[])
	{
		this.a=a;
	}
	void CheckMejo()
	{
		int maxC=0,c = 0,index=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						index=i;
					}
				}
			if(c>maxC)
			{
				maxC=c;
			}
		}
		
		if(maxC>a.length/2)
		{
			System.out.println("mejority element found");
		}
		else
		{
			System.out.println("mejority element not found");
		}
	}
}
public class Majority 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		int a[] = new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		Mejo m = new Mejo(a);
		m.CheckMejo();
	}
}