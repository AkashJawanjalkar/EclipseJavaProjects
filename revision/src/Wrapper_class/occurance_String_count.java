package Wrapper_class;

import java.util.Scanner;

public class occurance_String_count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		
		char ch[] = name.toCharArray();
		Integer i,j,c;
		for(i=0;i<ch.length;i++)
		{
			for(j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
//		for(i=0;i<ch.length;i++)
//		{
//			System.out.print(ch[i]);
//		}
		
		for(i=0;i<ch.length;i++)
		{
			c=1;
			for(j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					i++;
				}
			}
			System.out.printf("\n%c is %d times",ch[i],c);
		}
		
	}
}