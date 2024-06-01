package class_object;
import java.util.*;
public class MajorityElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab = new Scanner(System.in);
		int a[] = new int[6],i,j;
		System.out.println("Enter 6 Array elements:");
		for(i=0;i<a.length;i++)
		{
		a[i] =  ab.nextInt();
		}
		System.out.println("Sort the array");
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				}
			}
		}
		for( i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
		int c=1;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==a[i+1])
			{
			c++;
				if(c>a.length/2)
				{
				System.out.println("Majority element found:"+a[i]+"\t"+"times");
				break;
				}
			}
		}

	}

}
