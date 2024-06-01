package Constructor;

import java.util.Scanner;

class dupliCheck extends Exception
{
	public String error() {
		return "the number reperted";
	}
}
class duplicate 
{
	int a[];
	public void set(int a[]) 
	{
		this.a=a;
	}
	public void check() throws dupliCheck
	{
		for(int i=0;i<a.length;i++)
		{
			
				if(a[i]==a[i+1])
				{
					dupliCheck dc = new dupliCheck();
					throw dc;
				}
				else
				{
					System.out.println("Number is not repeated");
				}
			
		}
	}
}
public class thows_duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter Array elements");
		for(int i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		
		try {
			duplicate d = new duplicate();
			d.set(a);
			d.check();
		}
		catch(dupliCheck dc)
		{
			System.out.println("error is:"+dc);
		}
	}
}