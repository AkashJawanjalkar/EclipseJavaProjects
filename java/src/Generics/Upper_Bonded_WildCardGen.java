package Generics;

import java.util.ArrayList;
import java.util.List;

class test1
{
	void acceptData(List<? extends Number>list)
	{
		for(Number i:list)
		{
			System.out.println(i);
		}
	}
}
public class Upper_Bonded_WildCardGen {

	public static void main(String[] args) {
		test1 t = new test1();
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		t.acceptData(list);
		
		List<Float> l1 = new ArrayList<Float>();
		l1.add(2.3f);
		l1.add(22.3f);
		l1.add(3.2f);
		l1.add(1.1f);
		l1.add(11.1f);
		t.acceptData(l1);
		
		
		
	}

}
