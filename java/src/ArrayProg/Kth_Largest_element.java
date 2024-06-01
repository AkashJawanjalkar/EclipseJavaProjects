package ArrayProg;

import java.util.Scanner;

public class Kth_Largest_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter elements");
		for(int i=0;i<5;i++)
		{
			a[i]= sc.nextInt();
		}
		
		//sort
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[i]=t;
				}
			}
		}
		
		int b[] = null;
		int z=0;
		
		for(int i=0;i<5;i++)
		{
			boolean t=true;         //for remove duplicate
			for(int j=0;j<5;j++)
			{
				if(a[i]==a[j])
				{
					t=false;
				}
			}
			if(t==true)
			{
				b[z]=a[i];
				z++;
			}
		}
		
		System.out.println("Enter Kth large");
		int k = sc.nextInt();
		
		System.out.println("Kth largest element: " + a[k]);
	}
}