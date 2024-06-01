package Wrapper_class;

import java.util.Scanner;

public class String_Swara {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer ch,i=0,j=0;
		String swara ="srgmpdns";
		char a[] = swara.toCharArray();
		do
		{
			System.out.println("Enter choice");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1->
			{
				for(i=0;i<a.length;i++)
				{
						System.out.print(swara.charAt(i));
				}
				
				System.out.println("\n");
				for(i=a.length-1;i>=0;i--)
				{
					System.out.print(swara.charAt(i));
				}
				System.out.println("\n\n");
			}
			case 2->
			{
				for(i=0;i<a.length;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.print(swara.charAt(i));
					}
					System.out.print(" ");
				}
				System.out.println("\n");
				for(i=a.length-1;i>=0;i--)
				{
					for(j=0;j<2;j++)
					{
						System.out.print(swara.charAt(i));
					}
					System.out.print(" ");
				}
				System.out.println("\n\n");
			}
			case 3->
			{
//				for(i=0;i<a.length-2;i++)
//				{
//					for(j=i;j<=i+2;j++)
//					{
//						System.out.print(swara.charAt(j));
//					}
//					System.out.print(" ");
//				}
//				System.out.println("\n");
				for(i=a.length;i>2;i--)
				{
					for(j=i;j<i+2;j++)
					{
						System.out.print(swara.charAt(j));
					}
					System.out.print(" ");
				}
			}
			case 4->
			{
				
			}
			case 5->
			{
				
			}
			case 6->
			{
				
			}
			case 7->
			{
				
			}
			default ->
			{
				System.out.println("Thanks visit again- You are Exited");
			}
			}		
		}
		while(ch<8);
	}
}