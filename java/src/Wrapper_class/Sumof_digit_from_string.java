package Wrapper_class;

import java.util.Scanner;

public class Sumof_digit_from_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String contain digit");
		String mix = sc.nextLine();

		char n[] = mix.toCharArray();
		Integer sum=0,k=0;
		for(Integer i=0;i<n.length;i++)
		{
			if(n[i]<='9' && n[i]>='0')
			{
				sum=sum+n[i];
			}
		}
		System.out.println("the sum is:"+sum);
	}
}