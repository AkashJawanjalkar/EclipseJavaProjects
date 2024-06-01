package JDK_1_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamApi_Reduce {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(10,20,30,40,50);
//		Stream<Integer> s1 = list.stream();
//		int result = s1.reduce(0, new BinaryOperator<Integer>()
//				{
//					public Integer apply(Integer t, Integer u)
//					{
//						return t+u;
//					}
//				});
//		
//		System.out.printf("Sum of all values is %d\n ",result);
		
//		List<Integer> list = Arrays.asList(10,20,30,40,50);
//		Stream<Integer> s1 = list.stream();
//		int result = s1.reduce(0, (Integer t, Integer u)->t+u);
//					
//		System.out.printf("Sum of all values is %d\n ",result);
		
		System.out.printf("Sum of all values is %d\n ",Arrays.asList(10,20,30,40,50)
				.stream().reduce(0, (Integer t, Integer u)->t+u));
	}
}