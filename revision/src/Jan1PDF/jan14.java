package Jan1PDF;

import java.util.Scanner;

class MatrixMul
{
	int a[][];
	int b[][];
	int c[][] = new int[3][3];
	void AcceptArr(int a[][],int b[][])
	{
		this.a=a;
		this.b=b;
	}
	void ShowMatMul()
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j] = a[i][j]*b[i][j];
			}
		}
		
		System.out.println("the Matrix Mul is");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
public class jan14 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int i,j;
		System.out.println("Enter matrix value for a:");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter matrix value for b:");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b.length;j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		
		MatrixMul m = new MatrixMul();
		m.AcceptArr(a,b);
		m.ShowMatMul();
	}

}
