package Collection;

import java.util.Iterator;
import java.util.Stack;

public class dataFetchingStack {

	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		Iterator i = s.iterator();
		
		while(i.hasNext())
		{
			Object obj = i.next();
			System.out.println(obj);
		}
	}

}
