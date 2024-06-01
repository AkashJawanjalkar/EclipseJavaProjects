package Collection;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {
		Vector v = new Vector();
		
		Scanner sc = new Scanner(System.in);
		int ch,size;
		
		System.out.println("Enter size:");
		size = sc.nextInt();
		do
		{
			System.out.println("Enter choice:");
			System.out.println("1.Add values, 2.Display, 3.Add new value, 4.Search value, 5.Sort ascending, 6.sort descending, 7.Find max, 8.Find Min, 9.Update value, 10.Delete Value");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				for(int i=0;i<size;i++)
				{
					v.add(sc.nextInt());
				}
				break;
			case 2:
				Object obj[] = v.toArray();
				for(int i=0;i<size;i++)
				{
					System.out.println(obj[i]);
				}
			break;
			case 3:
				System.out.println("enter new value for add");
				int no = sc.nextInt();
				
				v.add(no);
				size++;
			break;
			case 4:
				boolean b=v.contains(23);
				if(b)
				{
					System.out.println("value contains");
				}
				else
				{
					System.out.println("value not contain");
				}
			break;
			case 5:
				Collections.sort(v);;
			break;
			case 6:
				Collections.sort(v,Collections.reverseOrder());	
			break;
			case 7:
				int m = (int) Collections.max(v);
				System.out.printf("max is %d",m); 
			break;
			case 8:
				int m1 = (int) Collections.min(v);
				System.out.println("min is "+m1);
			break;
			case 9:
				v.set(3, 200);
			break;
			case 10:
				v.remove(0);
				size=size-1;
			break;
			default:
				System.out.println("Exit_Thank You");
			}			
		}
		while(ch<11);
	}
}