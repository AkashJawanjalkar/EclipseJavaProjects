package ArrayProg;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArray {

	public static void main(String[] args) 
	{

		int a[] = { 3, 4, 3, 5, 9 };
		int c = 3;
		Arrays.sort(a);
		int d = 0;
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] < c) {
				b[d] = a[i];
				d++;
			} else if (a[i] > c) {
				b[d] = a[i];
				d++;
			}
		}
		for (int i = 0; i < d; i++) 
		{
			System.out.println(b[i]);
		}
	}
}