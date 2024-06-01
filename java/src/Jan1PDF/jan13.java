package Jan1PDF;

import java.util.Scanner;

class PrintMatrix
{
	int x[][];
	void Accept2dArray(int x[][])
	{
		this.x=x;
	}
	void ShowMatrix()
	{
		System.out.println("the Matrix is");
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				System.out.print(x[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
public class jan13 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		System.out.println("enter 9 matrix values:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		PrintMatrix p = new PrintMatrix();
		p.Accept2dArray(a);
		p.ShowMatrix();
	}
}
