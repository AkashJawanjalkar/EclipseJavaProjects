package Generics;

interface Radius<E>
{
	void setRadius(E e);
}
class CircleArea<E> implements Radius<Integer>
{
	public void setRadius(Integer e)
	{
		System.out.println("i am integer radius "+e);
	}
}
class cirm<E> implements Radius<Float>
{
	public void setRadius(Float e)
	{
		System.out.println("I am float radius "+e);
	}
}
public class Interface_with_Generics {

	public static void main(String[] args) {
		CircleArea <Integer> ca = new CircleArea<Integer>();
		ca.setRadius(5);
		cirm<Float> cm = new cirm<Float>();
		cm.setRadius(5.4f);
	}

}
