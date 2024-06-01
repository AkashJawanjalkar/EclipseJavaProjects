package ArrayProg;

import java.util.Scanner;

public class InsertElemenetInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array elements");
		int a[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i]= sc.nextInt();
		}
		System.out.println("Enter index:");
		int index=sc.nextInt();
		System.out.println("Enter value:");
		int value=sc.nextInt();
		int b[]=new int[a.length+1];
		
		for(int i=0;i<6;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else if(i==index)
			{
				b[i]=value;
			}
			else
			{
				b[i]=a[i-1];
			}
		}

		System.out.println("after Inserting array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}
}