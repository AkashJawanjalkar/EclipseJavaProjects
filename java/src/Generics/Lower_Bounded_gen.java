package Generics;

import java.util.ArrayList;
import java.util.List;

class Aa
{
	void show()
	{
		System.out.println("I am show method");
	}
}
class B extends Aa
{
	void Display()
	{
		System.out.println("i am display method");
	}
}
class test2
{
	void AccceptData(List<? super B>list)
	{
		Aa a = (Aa )list.get(0);
		a.show();
	}
}
public class Lower_Bounded_gen {

	public static void main(String[] args) {
		List<Aa> list = new ArrayList<Aa>();
		Aa a1 = new B();
		list.add(a1);
		test2 t = new test2();
		t.AccceptData(list);
	}

}
