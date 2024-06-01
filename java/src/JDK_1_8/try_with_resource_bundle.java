package JDK_1_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_with_resource_bundle {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter two values");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c=a/b;
			System.out.println("Division is "+c);
		}
		catch(ArithmeticException | InputMismatchException | NumberFormatException ex)
		{
			String s =(ex instanceof ArithmeticException)?"Aarithmatic Exception is "+ex:
				(ex instanceof InputMismatchException)?"Input Mismatch Exception is "+ex:
					"Number format Exception "+ex;
			System.out.println(s);
		}
	}

}
