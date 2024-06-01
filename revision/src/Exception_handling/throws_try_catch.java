package Exception_handling;

import java.util.Scanner;

class devide extends ArrayOutOfBoundException 
{
	int x,y;
	public void Set (int a,int b) throws ArithmeticException
	{
		x=a;
		y=b;
		int c=x/y;
		System.out.println("Division is "+c);
	}
}
public class throws_try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("enter two value:");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			devide d = new devide();
			d.Set(a, b);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Error is: "+ex);
		}
		System.out.println("dost dost na raha");
	}
}