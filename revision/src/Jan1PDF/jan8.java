package Jan1PDF;

import java.util.Scanner;

class ArrayFreCount 
{
	static char ch[];

	void setArray(char ch[]) 
	{
		this.ch = ch;
	}

	void CountFre() 
	{
		for (int i = 0; i < ch.length; i++) 
		{
			int count = 1;
			boolean b = true;

			for (int j = 0; j <i; j++) 
			{
				if (ch[i] == ch[j]) 
				{
					b = false;
					break;
				}
			}
			if (b) 
			{
				for (int j = i + 1; j < ch.length; j++) 
				{
					if (ch[i] == ch[j]) 
					{
						count++;
					}
				}
				System.out.printf("\n%c is %d times", ch[i], count);
			}
		}
	}
	void conToUpper()
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i] = (char) (ch[i]-32);
			}
		}
		System.out.println("\n\nConverted to uppercase: " + new String(ch));
	}
}

public class jan8 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter character array(name): ");
		name = sc.nextLine();
		char ch[] = name.toCharArray();

		ArrayFreCount a = new ArrayFreCount();
		a.setArray(ch);
		a.CountFre();
		a.conToUpper();
	}
}
