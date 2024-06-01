package Constructor;

import java.util.Scanner;

class MergeArray
{
	int a[],b[];
	int c[] = new int[6];

	MergeArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	void MTA()
	{
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[i+a.length]=b[i];
		}
	}
	void SortArray()
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+"\t");
		}
	}
	
}
public class Merge_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		System.out.println("Enter 3 Element for A");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter 3 Element for B");
		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		MergeArray m = new MergeArray(a,b);
		m.MTA();
		m.SortArray();
	}

}
 
