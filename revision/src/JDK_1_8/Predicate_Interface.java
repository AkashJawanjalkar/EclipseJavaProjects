package JDK_1_8;

import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {
//01		Predicate<Integer> p = new Predicate<Integer>()
//				{
//					public boolean test(Integer t)
//					{
//						return t%2==0;
//					}
//				};
//				boolean b = p.test(10);
//				if(b)
//				{
//					System.out.println("Number is ever");
//				}
//				else
//				{
//					System.out.println("Number is odd");
//				}
		
//02	Predicate<Integer> p =(Integer t)->
//			{
//				return t%2==0;
//			};
//		
//		boolean b = p.test(10);
//		if(b)
//		{
//			System.out.println("Number is ever");
//		}
//		else
//		{
//			System.out.println("Number is odd");
//		}
		
		
//03	boolean b = ((Predicate<Integer> )(Integer t)->t%2==0).test(10);
//	if(b)
//	{
//		System.out.println("Number is ever");
//	}
//	else
//	{
//		System.out.println("Number is odd");
//	}
		
		
//04		if(((Predicate<Integer> )(Integer t)->t%2==0).test(10))
//		{
//			System.out.println("Number is even");
//		}
//		else
//		{
//			System.out.println("Number is odd");
//		}
		
//05		String s=(((Predicate<Integer> )(Integer t)->t%2==0).test(10))?"Number is even":"Number is odd";
//		System.out.println(s);
		
		
		System.out.println((((Predicate<Integer> )(Integer t)->t%2==0).test(10))
				?"Number is even":"Number is odd");
		
	}

}
