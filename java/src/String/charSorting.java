package String;

import java.util.Scanner;

public class charSorting {

	public static void main(String[] args) {
		
		
		//this is aniket
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		char ch[]= str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String str2=str.valueOf(ch);
		//String str3=new String(ch);
		System.out.println("String after sort  " + str2);
		
	}

}
