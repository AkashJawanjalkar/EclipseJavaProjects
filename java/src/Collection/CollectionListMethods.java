package Collection;

import java.util.ArrayList;

public class CollectionListMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		int s = al.size();					//1
		
		System.out.println("no of element present:"+s);
		boolean b =al.isEmpty();			//2
		if(b)
		{
			System.out.println("empty");
		}
		else
		{
			System.out.println("Not empty");
		}
	 	boolean b1 = al.contains(20);		//3
		if(b1)
		{
			System.out.println("data found");
		}
		else
		{
			System.out.println("data not found");
		}
		Object obj[] = al.toArray();		//4
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
//		boolean b2=(boolean) al.remove(10);		//5
//		if(b2)
//		{
//			System.out.println("element deleted");
//		}
//		else
//		{
//			System.out.println("Element not deleted");
//		}
	}

}
