package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Display_Repetative_El_AL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(100);
		al.add(400);
		al.add(200);
		al.add(100);
		
		//Object obj[] = al.toArray();
		
		//for search value contains or not
//		System.out.println("enter value for search:");
//		int value= sc.nextInt();
//		
//			
//		int c=1;
//		
//		for(int i=0;i<al.size();i++)
//		{
//			for(int j=i+1;j<al.size();j++)
//			{
//				if((int)al.get(i)==value)
//				{
//					System.out.println("Value found");	
//					c=0;
//					break;
//				}
//			}
//		}
//		if(c==1)
//		{
//			System.out.println("not found");
//		}
		
	
		//sort
		for(int i=0;i<al.size();i++)
		{
			for(int j=0;j<al.size();j++)
			{
				if((int)al.get(i)<(int)al.get(j))
				{
					int temp= (int)al.get(i);
					al.set(i, al.get(j));
					al.set(j,temp);
				}
			}
		}

//		int count =1;
//		for(int i=0;i<al.size();i++)
//		{
//			count=1;
//			for(int j=i+1;j<al.size();j++)
//			{
//				if((int)al.get(i)==(int)al.get(j))
//				{
//					count++;
//					al.set(j,-1);
//				}
//			}
//			if(count>1 && (int)al.get(i)!=-1)
//			System.out.println(al.get(i)+"---->"+count);
//		}

		//remove duplicate
		int flag=0;
		int size=al.size();
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(al.get(i)==al.get(j))
				{
					for(int k=j;k<size-1;k++)
					{
						al.set(k, al.get(k+1));
					}
					size--;
				}
				
			}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(al.get(i));
		}
		
		
	}
}