package ArrayProg;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0;i<3;i++)
		{
			sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
				System.out.print(a[i][j]);
			}
			System.out.printf(" =%d",sum);
			System.out.println("\n");
		}
	}
}