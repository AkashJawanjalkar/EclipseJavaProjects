package ArrayProg;

import java.util.Scanner;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r[] = new int[6];
		System.out.println("enter array elements");
		for(int i=0;i<6;i++)
		{
			r[i] = sc.nextInt();
		}
		//move all zeros to end
		int s[] = new int[6];
		int c=0;
		for(int i=0;i<6;i++)
		{
			if(r[i]==0)
			{
				c++;
			}
			else
			{
				s[i]=r[i];
			}
			
		}
		

		System.out.println("After moving all zero to end");
		for(int i=0;i<6;i++)
		{
			System.out.println(r[i]+"\t");
		}
	}
}
