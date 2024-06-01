package Generics;

class A<E>
{
	void add(E e)
	{
		System.out.println("Value is "+e);
	}
}
public class class_With_Generics {

	public static void main(String[] args) {
		A <Integer> a1 = new A<Integer>();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		a1.add(500);
	}

}
