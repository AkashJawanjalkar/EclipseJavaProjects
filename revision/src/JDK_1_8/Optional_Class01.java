package JDK_1_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Class01 {
	static int sum=0;
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(10,20,30,null,40,50);
//		list.forEach((value)->{
//			Optional<Integer> o = Optional.ofNullable(value);
//			Optional.ofNullable(value).ifPresent((value1)->{
//				sum=sum+value1;
//			});
//		});
//		System.out.println("Sum is "+sum);
		
		
		
		Arrays.asList(10,20,30,null,40,50).forEach((value)->Optional
				.ofNullable(value).ifPresent((value1)->sum=sum+value1));
		System.out.println("Sum is "+sum);
	}

}
