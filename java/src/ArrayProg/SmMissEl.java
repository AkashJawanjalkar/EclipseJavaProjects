package ArrayProg;

import java.util.Scanner;

public class SmMissEl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("enter the 5 elements:");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("After sorting");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]<a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int k=0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<=j && a[i+1]>j)
				{
					k=a[i]+1;
				}
			}
		}
		System.out.println("The smallest missing element is"+k);

	}
}
