package Wrapper_class;

import java.util.Scanner;

public class rotate_array_by_N_pos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer i,j,k=0;
		Integer b[] = new Integer[5];
		Integer a[] = new Integer[5];
		System.out.println("Enter 5 Array elements");
		for(i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter position you want to rotate array");
		Integer p = sc.nextInt();
		
		for( i=p;i<a.length;i++)
		{ 
			b[k]=a[i];
			k++;
		}	
		for( i=0;i<p;i++)
		{
			b[k]=a[i];
			k++;
		}
		
		System.out.println("After rotating array from specific position");
		for (i = 0; i < b.length; i++) 
		{
			System.out.println(b[i]);
		}
	}
}