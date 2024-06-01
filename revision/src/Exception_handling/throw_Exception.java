package Exception_handling;

import java.util.Scanner;

class oddException extends Exception
{
	public String errorMes()
	{
		return "number is even";
	}
}
class odd
{
	int x[];
	public void set(int a[])
	{
		x=a;
	}
	public void check() throws oddException
	{
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2!=0)
			{
				oddException oe = new oddException();
				throw oe;
			}
			else
			{
				System.out.println("Number is even");
			}
		}
	}
}
public class throw_Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter 5 Array elemnts");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		try {
			odd o = new odd();
			o.set(a);
			o.check();
		}
		catch(oddException ex){
			System.out.printf("error is "+ex);
//		ex.printStackTrace();
		}
	}
}