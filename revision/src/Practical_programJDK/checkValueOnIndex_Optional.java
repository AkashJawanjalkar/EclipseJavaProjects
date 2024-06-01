package Practical_programJDK;

import java.util.Optional;
import java.util.Scanner;

public class checkValueOnIndex_Optional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[10];
		System.out.println("Enter Array elements");
		for(int i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter value for check");
		int c = sc.nextInt();
		
		boolean b= false;
		//Optional<Integer> o = Optional.ofNullable(c);
		
		for(int i=0;i<10;i++)
		{
			if(Optional.ofNullable(a[i]).isPresent())
			{
				if(((Optional.ofNullable(a[i])).get()).equals(c)) {
					b=true;
					System.out.println("Value present on index "+i);
					break;
				}
			}
		}
		if(!b)
		{
			System.out.println("value not present");
		}
	}

}
