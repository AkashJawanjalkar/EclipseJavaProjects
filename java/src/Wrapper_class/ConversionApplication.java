package Wrapper_class;

public class ConversionApplication 
{

	public static void main(String[] args) 
	{
		//StringBuffer s = new StringBuffer("good morning ");
		StringBuilder s=new StringBuilder("good morning ");
		System.out.println(" Before Append "+s+"\t"+System.identityHashCode(s));
		s.append("India");
		System.out.println(" After Append "+s+"\t"+System.identityHashCode(s));
		s.insert(4, 2024);
		System.out.println(" After insert "+s+"\t"+System.identityHashCode(s));
		s.delete(0, 4);
		System.out.println(" After delete "+s+"\t"+System.identityHashCode(s));
	}
}