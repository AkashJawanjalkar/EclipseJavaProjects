package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class DataFetchingArray {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Iterator i = al.iterator();
		
		while( i.hasNext())
		{
			Object obj = i.next();
			
			System.out.println(obj);
		}
	}

}
