package JDK_1_8;

import java.util.function.Function;

public class FunctionInt_Div {

	public static void main(String[] args) {
		
		//Double result = ((Function<Double,Double>)(Double t)->t*4.0).andThen((Double t)->t-2.0).apply(13.0);
		System.out.println("result is "+((Function<Double,Double>)(Double t)->t*4.0)
				.andThen((Double t)->t-2.0).apply(13.0));
	}
}