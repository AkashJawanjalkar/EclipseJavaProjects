package Abstraction;

import java.util.Scanner;

abstract class value
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract void performCal();
}
class add extends value
{
	void performCal() {
		int s= a+b;
		System.out.println("Sum is "+s);
	}	
}
class mul extends value
{
	void performCal() {
	int m= a*b;
	System.out.println("Mul is "+m);
	}
}
class div extends value
{
	void performCal() {
		int d= a/b;
		System.out.println("Div is "+d);
	}
}
class sub extends value
{
	void performCal() {
		int sub= a-b;
		System.out.println("Sub is "+sub);
	}
}
class Calc
{
	void performOp(value v)
	{
		v.performCal();
	}
}
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice- \n1.add\n2.mul\n3.Div\n4.Subs");
		int ch;
		Calc c = new Calc();
		do {
			ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				value a = new add();
				a.setValue(4, 534);
				c.performOp(a);
				break;
			case 2:
				value b = new mul();
				b.setValue(4, 5);
				c.performOp(b);
				break;
			case 3:
				value x = new div();
				x.setValue(16, 2);
				c.performOp(x);
				break;
			case 4:
				value y = new sub();
				y.setValue(95, 35);
				c.performOp(y);
				break;
			default:
				System.out.println("exit");
		}
		}
		while(ch<5);
	}
}