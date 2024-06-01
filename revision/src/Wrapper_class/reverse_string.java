package Wrapper_class;

import java.util.Scanner;

public class reverse_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String name = sc.nextLine();
		
		char[] ch = name.toCharArray();
		//char n[]= new char[ch.length];
		Integer mid,end,i,j;
		mid=ch.length/2;
		end=ch.length-1;
		for( i=0,j=end;i<mid;i++,j--)
		{
			char t = ch[i];
			ch[i]=ch[j];
			ch[j]=t;
		}
		for(i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
