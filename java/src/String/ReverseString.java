package String;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String");
	String str= sc.nextLine();
	char ch[] = str.toCharArray();
	
	for(int i=0,j=ch.length-1;i<(ch.length/2);i++,j--)
	{
		char c = ch[i];
		ch[i] = ch[j];
		ch[j] = c;
	}
	
	String str2 =  new String(ch);
	System.out.println("After reverse\n "+str2);
	
	int  start=0, end, next;
	char temp;
	int len=ch.length;
	for(int i=0;i<ch.length-1;i++)         
	{                                                  
		if(ch[i]==' ' || i==len-1)
		{
			end=i-1;  
			next=i+1;  
			while(start<end)
			{                         
				temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}
			start=next;
		}
	}
	//String str2 =  new String(ch);
	System.out.println();
	for(int i=0;i<ch.length;i++) {
 	System.out.print(ch[i]);
	}
	}
}