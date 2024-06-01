package ScannerClass;

import java.util.Scanner;

public class Prime_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		System.out.println("Enter number for printing prime number");
		no = sc.nextInt();
		int c=0;
		for(int i=0;i<=no;i++)
		{
		c=1;
			for(int j=1;j<=i/2;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(i+"\t");
			}
		}
	}
}