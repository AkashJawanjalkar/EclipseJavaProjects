package Collection;

import java.util.Scanner;
import java.util.Vector;

public class SearchDataFromVector {

	
		public static void main(String xyz[])
		{
		Scanner sc = new Scanner(System.in);
		Vector v = new Vector();
		int limit;
		System.out.println("Enter limit");
		limit = sc.nextInt();
		
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter data in vector");
			int data = sc.nextInt();
			v.add(data);
		}
		
		System.out.println("Enter data for search:");
		int sdata = sc.nextInt();
		boolean flag = false;
		for(Object obj:v)
		{
			if((int)obj==sdata)	
				{
				flag=true;
				break;
				}
		}
//		boolean b = v.contains(sdata);
		if(flag)
		{
			System.out.println("Data found");
		}
		else
		{
			System.out.println("data not found");
		}

		}
}
