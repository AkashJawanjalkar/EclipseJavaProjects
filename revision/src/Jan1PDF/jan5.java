package Jan1PDF;

import java.util.*;

class Sum
{
	int a[];
	void calSum(int ...a)
	{
		this.a=a;
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		
		System.out.println("Sum is :"+s);
	}
}
public class jan5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter 5array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt(); 
		}
		
		Sum c = new Sum();
		c.calSum(a);
	}
	

}
