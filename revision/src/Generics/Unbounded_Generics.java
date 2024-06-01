package Generics;

import java.util.ArrayList;
import java.util.List;

class test
{
	void acceptData(List<?>list)
	{
		for(Object i:list)
		{
			System.out.println(i);
		}
	}
}
public class Unbounded_Generics {

	public static void main(String[] args) {
		test t = new test();
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		t.acceptData(list);
		
		List<Float> l1 = new ArrayList<Float>();
		l1.add(2.3f);
		l1.add(22.1f);
		l1.add(2.1f);
		t.acceptData(l1);
	}

}
