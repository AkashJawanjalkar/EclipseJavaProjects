package Interface;

import java.util.Scanner;

interface ArrayOperation
{
	void performOperation(int x[]);
}

class sorting implements ArrayOperation
{
	public void performOperation(int[] x) {
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					int t = x[i];
					x[i] = x[j];
					x[j] = t;
				}
			}
		}
		System.out.println("After Sort");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]+"\t");
		}
	}
}

class insertion implements ArrayOperation
{
	public void performOperation(int[] x) {
		Scanner xy = new Scanner(System.in);
		System.out.println("Enter element and index you want to insert");
		int el = xy.nextInt();
		int in = xy.nextInt();
		int a[] = new int[x.length+1];
		for(int i=0,j=0;i<a.length;i++,j++)
		{
			if(i==in)
			{
				a[i]=el;
				i++;
			}
				a[i]=x[j];
		}
		System.out.println("After insert");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
}

class deletion implements ArrayOperation
{
	public void performOperation(int[] x) {
		
	}
}

class reverse implements ArrayOperation
{
	public void performOperation(int[] x) {
		
	}
}
public class ArrayOp 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array elements:");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		int ch;
		System.out.println("enter choice- \n1.sorting\n2.insertion\n3.delete\n4.reverse\n5.exit");
		do {
			ch = sc.nextInt();
			switch(ch)
			{
			case 1->
			{
				ArrayOperation s = new sorting();
				s.performOperation(a);
			}
			case 2->
			{
				ArrayOperation i = new insertion();
				i.performOperation(a);
			}
			case 3->
			{
				ArrayOperation d = new deletion();
				d.performOperation(a);
			}
			case 4->
			{
				ArrayOperation r = new reverse();
				r.performOperation(a);
			}
			default->
			{
				System.out.println("Exit");
			}
			}
		}
		while(ch<5);
		}
}