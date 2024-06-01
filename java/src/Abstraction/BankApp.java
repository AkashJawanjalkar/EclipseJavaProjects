package Abstraction;

import java.util.*;

abstract class rid
{
	abstract float calInterest();
	abstract float crr();
	abstract float slr();
}
class SBI extends rbi
{
	private static final String System = null;
	float amt,inte;
	float c,s;
	void setAmount(int amt)
	{
		this.amt=amt;
	}
	float calInterest() {
		inte=amt/100*8;
		return inte;
	}

	float crr() {
		c=amt/100*4.5f;
		return c;
	}

	float slr() {
		s=amt/100*18;
		return s;
	}
	void Display()
	{
		System.out.println("_______________________________________");
		System.out.println("Welcome To SBI bank\nFor Your Amount->");
		System.out.println("Interest\tCRR\tSLR");
		System.out.println(inte+"\t\t"+c+"\t"+s);
		System.out.println("_______________________________________");
	}
}
class HDFC extends rbi
{
	float amt,inte;
	float c,s;
	void setAmount(int amt)
	{
		this.amt=amt;
	}
	float calInterest() {
		inte=amt/100*5;
		return inte;
	}

	float crr() {
		c=amt/100*4.5f;
		return c;
	}

	float slr() {
		s=amt/100*18;
		return s;
	}
	void Display()
	{
		System.out.println("_______________________________________");
		System.out.println("Welcome To HDFC bank\nFor Your Amount->");
		System.out.println("Interest\tCRR\tSLR");
		System.out.println(inte+"\t\t"+c+"\t"+s);
		System.out.println("_______________________________________");
	}
}
class ICICI extends rbi
{
	float amt,inte;
	float c,s;
	void setAmount(int amt)
	{
		this.amt=amt;
	}
	float calInterest() {
		inte=amt/100*6;
		return inte;
	}

	float crr() {
		c=amt/100*4.5f;
		return c;
	}

	float slr() {
		s=amt/100*18;
		return s;
	}
	void Display()
	{
		System.out.println("_______________________________________");
		System.out.println("Welcome To ICICI bank\nFor Your Amount->");
		System.out.println("Interest\tCRR\tSLR");
		System.out.println(inte+"\t\t"+c+"\t"+s);
		System.out.println("_______________________________________");
	}
}
public class BankApp{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amt = sc.nextInt();
		int ch;
		
		System.out.println("enter Choice_\n1.SBI\n2.HDFC\n3.ICICI");
		do {
		ch = sc.nextInt();
		switch(ch)
		{
		case 1->
		{
			SBI s = new SBI();
			s.setAmount(amt);
			s.calInterest();
			s.crr();
			s.slr();
			s.Display();
		//break;
		}
		case 2->
		{
			HDFC h = new HDFC();
			h.setAmount(amt);
			h.calInterest();
			h.crr();
			h.slr();
			h.Display();
		//break;
		}
		case 3->
		{
			ICICI i = new ICICI();
			i.setAmount(amt);
			i.calInterest();
			i.crr();
			i.slr();
			i.Display();
		//break;
		}
		default->
		{
			System.out.println("Exit");
		}
		}
		}
		while(ch<4);
	}
}