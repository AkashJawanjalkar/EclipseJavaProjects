package ScannerClass;

import java.util.Scanner;

public class prime_or_not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int no = sc.nextInt();
		int c=0;
		for(int i=2;i<=no;i++)
		{

			if(no%i==0)
			{
				c++;
			}
		}
		if(c>1)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println(" prime");
		}
	}
}