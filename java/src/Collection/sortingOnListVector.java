package Collection;

import java.util.Collections;
import java.util.Vector;

public class sortingOnListVector {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(5);
		v.add(23);
		v.add(4);
		v.add(22);
		v.add(11);
		v.add(2);
		
		System.out.println("Before sorting");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		//Collections.sort(v);
		for(int i=0;i<v.size();i++)
		{
			for(int j=(i+1);j<v.size();j++)
			{
				Object prev = v.get(i);
				Object next = v.get(j);
				
				if((int)prev>(int)next)
				{
					v.set(i, next);
					v.set(j, prev);
				}
			}
		}
		System.out.println("After sort");
		for(Object obj:v)
		{
			System.out.println(obj);
		}
		
		// for second highest value
		System.out.println("Second highest is"+v.get(v.size()-2));
	}

}
