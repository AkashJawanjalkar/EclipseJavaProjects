package Exception_handling;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) 
	{
		
		int a;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter age:");
			a = sc.nextInt();
			
			System.out.println("Age is: "+a);
		}
		catch(Exception e)
		{
			System.out.println("Exception is:"+ e);
		}
		
	}

}
