package Collection;

import java.util.Iterator;
import java.util.Vector;

public class Vector_find_max {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		//Iterator i = v.iterator();
		int max=0;
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)>max)
			{
				max=(int)v.get(i);
			}
		}
		System.out.println("max is :"+max);
	}

}
