package class_object;

import java.util.Scanner;

public class AdityaL1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[17];
		int decimal =0, base=1;
		System.out.println("enter values;");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			decimal=0;
			base=1;
			while(a[i]!=0)
			{
				int rem = a[i]%10;
				decimal = decimal+rem*base;
				base =base * 2;
				a[i]/=10;
			}
			System.out.printf("%c",decimal-1);
		}
	}

}
//01010101,01010100,01000110,01000011,00100001,01000110,01001001,01010101,00100001,01010100,01001010,00100001,01000010,01001010,01000101,01001111,01001010
