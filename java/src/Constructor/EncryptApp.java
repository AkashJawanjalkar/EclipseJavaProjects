package Constructor;

import java.util.Scanner;

class Encrypt
{
	String name;
	
	char NewS[];
	int c=0;
	char ch[]=new char[5];
	Encrypt(char[] ch)
	{
		this.ch=ch;
	}
	void BeforeEnc()
	{
		System.out.println("Array Before Encryption:");
		for(int i=0;i<ch.length;i++)
		{
		    System.out.println(ch[i]);
		}
	}
	void AfterEnc()
	{
		c=1;
		for(int i=0;i<ch.length;i++)
	      {
	    	 for(int j=i+1;j<ch.length;j++)
	    	 {
	    		 if(ch[i]>ch[j])
	    		 {
	    			 char temp=ch[i];
	    			      ch[i]=ch[j];
	    			      ch[j]=temp;
	    		 }
	    	 }
	      }
	
		int c=1;
		for(int i=0;i<ch.length;i++)
	     {
	    	 if(i==ch.length-1)
	    	 {
	    		 System.out.printf("%c%d",ch[i],c);
	    		 break;
	    	 }
	    	 if(ch[i]==ch[i+1])
	    	 {
	    		 c++;
	    	 }
	    	 else
	    	 {
	    		 System.out.printf("%c%d",ch[i],c);
	    		 c=1;
	    	 }
	     }
	}
}
public class EncryptApp {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
	    
		System.out.println("Enter the string");
		String n=xyz.next();
		char ch[] = n.toCharArray();
		Encrypt e = new Encrypt(ch);
		e.BeforeEnc();
		e.AfterEnc();
	}
}