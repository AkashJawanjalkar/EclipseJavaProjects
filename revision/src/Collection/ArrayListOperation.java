package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		
		int ch;
		int size;
		
		System.out.println("Enter size of array:");
		size = sc.nextInt();
		
		do
		{
			System.out.println("Enter choice:");
			System.out.println("\n1.Add values, 2.Display, 3.Add New Values, 4.search values, 5.Sort in ascending 6.Sort in descending, 7.Max Values, 8.Min value, 9.Update value, 10.Delete value\n");
			
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				for(int i=0;i<size;i++)
				{
					int no = sc.nextInt();
					al.add(no);
				}
//				al.add(20);
//				al.add(30);
//				al.add(22);
//				al.add(98);
//				al.add(87);
//				al.add(45);
//				al.add(34);
//				al.add(43);
//				al.add(33);
//				al.add(44);
//						
			break;
			case 2:{
//				Object obj[] = al.toArray();
//				for(int i=0;i<obj.length;i++)
//				{
//					System.out.println(obj[i]);
//				}
				Iterator i = al.iterator();
				int j=0;
				while( j<al.size())
				{
					System.out.println(al.get(j++));
					
				}
			break;
			}
			case 3:
				System.out.println("Enter Value:");
				int  no = sc.nextInt();
				al.add(no);
				//size=size+1;
				
				for(int i1=0;i1<al.size();i1++)
				{
					System.out.println(al.get(i1));
				}
			break;
			case 4:
				System.out.println("Enter number for search:");
				int n=sc.nextInt();
//				boolean b = al.contains(n);
//				if(b)
//				{
//					System.out.println("element Contains");
//				}
//				else
//				{
//					System.out.println("element not contains");
//				}
				int flag=0;
				Object obj1[] = al.toArray();
				for(int i1=0;i1<obj1.length;i1++)
				{
					int b=(int) obj1[i1];
					if(n==b)
					{
						System.out.println("element contain:"+ obj1[i1]);
						flag=1;
						break;
					}	
				}
				if(flag==0)
				{
						System.out.println("element not contain");
				}
			break;
			case 5:
				//Collections.sort(al);
				for (int k = 0; k < al.size()-1 ; k++) {
			        for (int j = k+1; j < al.size(); j++) {
			            // Compare adjacent elements
			            if ((int)al.get(k) > (int)al.get(j)) {
			                // Swap them if they are in the wrong order
			                int temp =(int) al.get(k);
			                al.set(k, al.get(j));
			                al.set(j, temp);
			            }
			        }
			    }

			    System.out.println("After sorting ascending:");
			    for (int i1 = 0; i1 < al.size(); i1++) {
			        System.out.println(al.get(i1));
			    }
			    break;
			case 6:
				//Collections.sort(al,Collections.reverseOrder());
				for (int k = 0; k < al.size()-1 ; k++) {
			        for (int j = k+1; j < al.size(); j++) {
			            // Compare adjacent elements
			            if ((int)al.get(k) < (int)al.get(j)) {
			                // Swap them if they are in the wrong order
			                int temp =(int) al.get(k);
			                al.set(k, al.get(j));
			                al.set(j, temp);
			            }
			        }
			    }
				System.out.println("After sorting decending:");
			    for (int i1 = 0; i1 < al.size(); i1++) {
			        System.out.println(al.get(i1));
			    }
				
			break;
			case 7:
				//System.out.println(Collections.max(al));
				int max = (int) al.get(1);
				for(int o=0;o<al.size();o++)
				{
						if((int)al.get(o)>max)
						{
							max=(int)al.get(o);
						}
				}
				System.out.println("max element is: "+max);
				
			break;
			case 8:
				//System.out.println(Collections.min(al)) ;
				int min = (int) al.get(0);
				for(int o=0;o<al.size();o++)
				{
					if((int) al.get(o)<min)
					{
						min=(int)al.get(o);
					}
				}
				System.out.println("min element is: "+min);
			break;
			case 9:
				//al.set(2, 500);
//				System.out.println("enter index and element for insert:");
//				int index = sc.nextInt();
//				int element = sc.nextInt();
//				Object obje=
//				for(int o=0;o<;o++)
//				{
//					if(o==index)
//					{
//						(int)al.get(o)=(int)al.set(element);
//						
//					}
//				}
			break;
			case 10:
				//al.remove(1);
				//size=size-1;
				System.out.println("Enter index for remove: ");
//				int remi=sc.nextInt();
//				for(int o=0;o<al.size();o++)
//				{
//					if(o==remi)
//					{
//						(int)al.get(o)=(int)al.get(0+1)
//
//						//al.size--;
//					}
//				}
			break;
			
			default:
				System.out.println("Exit_ Thanks");
				}
		}
		while(ch<11);
	}
}