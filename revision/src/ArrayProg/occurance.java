package ArrayProg;

import java.util.Scanner;

public class occurance 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char[] ch = {'k', 'i', 'r', 'a', 'a', 'n'};
		int c=0;
		
		for(int i=0;i<ch.length;i++)
		{
			c=1;
			for(int j=0;j<ch.length;j++)
			{
				if (i != j && ch[i] == ch[j]) 
				{
                    c++;
				}
			}
			if(c>0)
			{
				System.out.printf("\n%c is %d times ",ch[i],c);
			}
		}	
	}
}