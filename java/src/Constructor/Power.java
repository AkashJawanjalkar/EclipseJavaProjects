package Constructor;

import java.util.Scanner;

class pow
{
	int b,i;
	pow(int base, int index)
	{
		this.b=base;
		this.i=index;
	}
	int getPower()
	{
		int po=1;
		for(int j=i;j>0;j--)
		{
			po=po*b;
		}
		return po;
	}
}

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b,i;
		System.out.println("Enter base and index:");
		b= sc.nextInt();
		i = sc.nextInt();
		
		pow p = new pow(b,i);
		int result= p.getPower();
		System.out.println(result);
	}
}