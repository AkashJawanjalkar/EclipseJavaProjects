package ArrayProg;

import java.util.Scanner;

public class missing_ele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[]= new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int c=0;
		//missing elemnts
		for(int i=0;i<4;i++)
		{
			c=1;
			for(int k=a[i]+1;k<a[i+1];k++)
			{
				System.out.println(k);
				c++;
			}
			if(c==1)
			{
				break;
			}
		}
	}

}
