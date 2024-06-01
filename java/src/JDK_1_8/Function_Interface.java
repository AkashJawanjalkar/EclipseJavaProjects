package JDK_1_8;

import java.util.function.Function;

public class Function_Interface {

	public static void main(String[] args) {
				
//				int result = ((Function<String,Integer>)(String t)->t.length()).apply("Good");
//				System.out.println("Length of string is "+result);		
				
//				Double result = ((Function<Double,Double>)(Double t)->t/2).apply(10.0);
//				System.out.println("result is "+result);
		
//				Function<Double,Double> f = (Double t)->t-2;
//				Function<Double,Double> f1 =(Double t)->t*3.0;
//				
//				Function<Double,Double> f2 = f1.andThen(f);
//		//		Function<Double,Double> f2 = f1.compose(f);
//				Double result = f2.apply(10.0);
//				System.out.println("result is "+result);
				
				System.out.println("result is "+((Function<Double,Double>)
						(Double t)->t/2.0).apply(10.0));
	}
}