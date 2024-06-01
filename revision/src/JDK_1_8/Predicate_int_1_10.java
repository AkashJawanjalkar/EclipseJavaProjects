package JDK_1_8;

import java.util.function.Predicate;

public class Predicate_int_1_10 {

	public static void main(String[] args) {
//01		Predicate<Integer> p1 = new Predicate<Integer>()
//				{
//					public boolean test(Integer t)
//					{
//						return t>=1;
//					}
//				};
//				
//		Predicate<Integer> p2 = new Predicate<Integer>()
//				{
//					public boolean test(Integer t)
//					{
//						return t<=10;
//					}
//				};
//				
//		Predicate<Integer> p3 = p2.and(p1);
//		boolean b = p3.test(4);
//		if(b)
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
		
//02		Predicate<Integer> p1 =(Integer t)->t>=1;
//		
//		Predicate<Integer> p2 =(Integer t)->t<=10;
//			
//		Predicate<Integer> p3 = p2.and(p1);
//		boolean b = p3.test(4);
//		if(b)
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
//03		Predicate<Integer> p1 =(Integer t)->t>=1;	
//		Predicate<Integer> p3 =((Predicate<Integer>)(Integer t)->t<=10).and(p1);
//		boolean b = p3.test(4);
//		if(b)
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
		
//04		Predicate<Integer> p1 =(Integer t)->t>=1;	
//		Predicate<Integer> p3 =((Predicate<Integer>)(Integer t)->t<=10).and(p1);
//		if(p3.test(4))
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
			
//05		Predicate<Integer> p3 =((Predicate<Integer>)(Integer t)->t<=10).and((Integer t)->t>=1);
//		if(p3.test(4))
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
//06		if(((Predicate<Integer>)(Integer t)->t<=10).and((Integer t)->t>=1).test(4))
//		{
//			System.out.println("Number between 1=10");
//		}
//		else
//		{
//			System.out.println("Number not between 1-10");
//		}
		
		
//07		String s = (((Predicate<Integer>)(Integer t)->t<=10).and((Integer t)->t>=1).test(4))
//		?"Number between 1=10":"Number not between 1-10";
//		System.out.println(s);
		
		
		
		System.out.println((((Predicate<Integer>)(Integer t)->t<=10).and((Integer t)->t>=1).test(4))
		?"Number between 1=10":"Number not between 1-10");
		
		
	}

}
