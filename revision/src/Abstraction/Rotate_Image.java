package Abstraction;

import java.util.Scanner;

class image
{
	static void reverse(int i, int mat[][],int N)
	{
		int start =0;
		int end = N-1;
		while(start<end) 
		{
			int temp = mat[i][start];
			 mat[i][start] = mat[i][start];
			 mat[i][end] =temp;
			 start++;
			 end--;
		}
	}
	static void rotateMat(int N,int mat[][])
	{
		//clockwise
//		for(int i=0;i<N;i++)
//			reverse(i,mat,N);
//		System.out.println("After Rotating clockwise direction");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(" "+mat[i][j]);
			}
			System.out.println("\n");
		}
		
		for(int i=0;i<N;i++)
		{
			for(int j=i;j<N;j++)
			{
				int temp = mat[i][j];
				mat[i][j] =mat[j][i];
				mat[j][i] =temp;
			}
		}
		//for clockwise
		for(int i=0;i<N;i++)
			reverse(i,mat,N);
	}
	
	static void display(int N,int mat[][])
	{
		System.out.println("After Rotating anti-clockwise direction");
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(" "+mat[i][j]);
			}
			System.out.println("\n");
		}
	}
}
public class Rotate_Image {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int N=3;
		
		System.out.println("enter 9 element for 2d array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		image i = new image();
		i.rotateMat(N,a);
		
		i.display(N,a);	
	}
}