package Collection;

import java.util.ListIterator;
import java.util.Vector;

public class DF_using_ListIterator {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		v.add(600);
		
		ListIterator li = v.listIterator(v.size());
		
		while(li.hasPrevious())
		{
			Object obj = li.previous();
			System.out.println(obj);
		}
		
	}

}
