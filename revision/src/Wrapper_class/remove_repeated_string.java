package Wrapper_class;

import java.util.Scanner;

public class remove_repeated_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name ="Ameet";
		
		char[] ch = name.toCharArray();
		char n[];
		Integer i,j,k,c=ch.length;
		k=0;
		for(i=0;i<c;i++)
		{
			for(j=i+1;j<c;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[k]=ch[i+1];
					k++;
				}
				else {
					ch[k]=ch[i];
					k++;
				}
			}
		}
		for(i=0;i<k;i++)
		{
			System.out.println(ch[i]);
		}	
	}
}