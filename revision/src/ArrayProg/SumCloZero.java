package ArrayProg;

import java.util.Scanner;

public class SumCloZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter the elements ");
		for(int i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}
		//38 44 63 -51 -35 19 84 -69 4 -46
		//two element whose sum is closest to zero
		int sum=0,min=-10000,k=0,l=0;
		for(int i=0;i<10;i++)
		{   
			for(int j=0;j<10;j++)
			{
				
				sum= a[i]+a[j];
				
				    if(min<sum && 0>=sum)
				    {
				    	min=sum;
				    	k=a[i];
				    	l=a[j];
				    }
					 sum=0;
				}
		}
		System.out.println();
		System.out.println("--->"+k+"\t"+l);
			}
		
}
