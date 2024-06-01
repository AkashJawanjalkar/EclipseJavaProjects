package ArrayProg;

import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x[] = new int[6];
		System.out.println("Enter elements:");
		for(int i=0;i<6;i++)
		{
			x[i] = sc.nextInt();
		}
		System.out.println("enter sum");
		int sum = sc.nextInt();
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(x[i]+x[j]==sum)
				{
					System.out.println(x[i]+"--"+x[j]);
				}
			}
		}
	}

}
