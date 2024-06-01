package JDK_1_8;

import java.util.Date;
import java.util.function.Supplier;

public class supplier_Interface {

	public static void main(String[] args) {
//		Supplier<Date> s  = new Supplier<Date>()
//				{
//					public Date get()
//					{
//						return new Date();
//					}
//				};
//			Date result = s.get();
//			System.out.println("Todays date is "+result);
		
//		Supplier<Date> s  =()->new Date();
//		
//	Date result = s.get();
//	System.out.println("Todays date is "+result);
		
		
		
		System.out.println("Todays date is "+((Supplier<Date>)()->new Date()).get());	
	}
}