package ArrayProg;

import java.util.Scanner;

public class ArrayOP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int i,j;
		int a[] = new int[6];
		
		for(i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("max is:");
		int max=a[0];
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				if(a[i]>max)
				{
					max=a[i];
				}
			}
		}
		System.out.println(max);
		
		System.out.println("Min is :");
		int min=a[0];
		for(i=0;i<6;i++)
		{
			for(j=0;j<6;j++)
			{
				if(a[i]<min)
				{
					min=a[i];
				}
			}
		}
		System.out.println(min);
		
		System.out.println("After sort:");
		for(i=0,j=5; i<3 ;i++,j--)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(i=0;i<6;i++)
		{
			System.out.println(a[i]);
		}
	}
}