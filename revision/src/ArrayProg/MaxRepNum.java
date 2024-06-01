package ArrayProg;
import java.util.*;
public class MaxRepNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.println("Enter array elements");
		for(int i=0;i<6;i++)
		{
			a[i] = sc.nextInt();
		}
		//max repeating number in array
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(a[i]<a[j])
				{
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println("After sorting ");
		for(int i=0;i<6;i++)
		{
			System.out.println(a[i]+"\t");
		}
		 
		System.out.println("maximum repeating number is");
		int c=1,z =0;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
			  if(a[i]==a[i+1])
			   {
				c++;
			   }
		    }
			if(c>2)
			{
				System.out.printf("%d\t",a[i]);
				
			}
		}
		
	}
}