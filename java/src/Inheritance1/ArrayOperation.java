package Inheritance1;

import java.util.Scanner;

class ArrayOpe
{
	int a[];
	ArrayOpe(int a[])
	{
		this.a=a;
	}
}
class sort extends ArrayOpe
{
	sort(int[] a) 
	{
		super(a);
	
	for(int i1=0;i1<a.length;i1++)
	{
		for(int j=0;j<a.length;j++)
		{
			if(a[i1]<a[j])
			{
				int t= a[i1];
				a[i1] = a[j];
				a[j] = t;
			}
		}
	}
	System.out.println("Array after Sort");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"\t");
	}
	System.out.println();
}
}

class insert extends ArrayOpe
{
	int m[];
	insert(int[] a) 
	{
		super(a);
		this.m=a;
	}
	void inse()
	{
		Scanner zx = new Scanner(System.in);
		System.out.println("enter index");
		int In = zx.nextInt();
		System.out.println("enter element");
		int el = zx.nextInt();
		int z[] = new int[m.length+1];
		 
		for(int i=0,j=0;i<z.length;i++,j++)
		{
			if(i==In)
			{
				z[i]=el;
				i++;
			}
			z[i]=m[j];
		}
		System.out.println("Array after element insert");
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]+"\t");
		}
		System.out.println();
	}
}
class delete extends ArrayOpe
{

	delete(int[] a) 
	{
		super(a);
	}
	void delete()
	{
		Scanner zx = new Scanner(System.in);
		System.out.println("Enter element want to delete");
		int ED = zx.nextInt();
		int d[] = new int[a.length-1];
		int i=0;
		for(int z=0;z<a.length;z++)
		{
			if(ED!=a[z])
			{
				d[i]=a[z];
				i++;
			}
		}
		System.out.println("Array after element delete");
		for(int x=0;x<d.length;x++)
		{
			System.out.println(d[x]+"\t");
		}
		System.out.println();
	}
}
class rev extends ArrayOpe
{

	rev(int[] a) 
	{
		super(a);
	}
	void reverse()
	{
	int mid=(a.length/2);
	int end=a.length-1;
	for(int i=0;i<mid;i++)
	{
		int temp=a[i];
		a[i]=a[end];
		a[end]=temp;
		end--;
	}
	System.out.println("Array after reverse");
	
	for(int b=0;b<a.length;b++)
	{
		System.out.println(a[b]+"\t");
	}
	System.out.println();
	}
}
public class ArrayOperation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("enter 6 array element");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc. nextInt();
		}
		sort s = new sort(a);
		insert i = new insert(a);
		delete d = new delete(a);
		rev r = new rev(a);
		
		i.inse();
		d.delete();
		r.reverse();
	}
}