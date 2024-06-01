package ArrayProg;

import java.util.Scanner;

public class GivenElAppMajor {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int s[] = new int[7];
		System.out.println("enter array elements:");
		for(int i=0;i<s.length;i++)
		{
			s[i] = xyz.nextInt();
		}
		System.out.println("enter element for counting appearance");
		int el = xyz.nextInt();
		int c=1;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==el)
			{
				c++;
			}
		}
		if(c>s.length/2)
		{
			System.out.printf("%d apperas more than 2 times in given array",el);
			
		}
		else if( c<=3)
		{
			System.out.println("Not appers more than half array");
			
		}
	}

}
