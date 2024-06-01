package JDK_1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi_Map {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(10,20,30,40,50);
//		ArrayList<Integer> newList = new ArrayList<Integer>();
//		
//		for(Integer val:list)
//		{
//			val=val*2;
//			newList.add(val);
//		}
//		System.out.println("After performing opration");
//		for(Integer val:newList)
//		{
//			System.out.println(val);
//		}	
		
//		List<Integer> list = Arrays.asList(10,20,30,40);
//		
//		Stream<Integer> strea1 = list.stream();
//		Function<Integer,Integer> f = new Function<Integer,Integer>()
//				{
//					public Integer apply(Integer t)
//					{
//						return t*2;
//					}
//				};
//				
//			Stream<Integer> stream2 = strea1.map(f);
//			List<Integer> rList = stream2.collect(Collectors.toList());
//			
//			Consumer<Integer> c = new Consumer<Integer>()
//					{
//				public void accept(Integer t) {
//					System.out.println(t);
//					
//					}
//					};
//					rList.forEach(c);
		
		
		
		//List<Integer> list = Arrays.asList(10,20,30,40);
		
		//Stream<Integer> stream1 = Arrays.asList(10,20,30,40).stream();
		//Function<Integer,Integer> f =(Integer t)->t*2;
					
			//Stream<Integer> stream2 = Arrays.asList(10,20,30,40).stream().map((Integer t)->t*2);
			//List<Integer> rList = Arrays.asList(10,20,30,40).stream().map((Integer t)->t*2).collect(Collectors.toList());
			
			//Consumer<Integer> c = (Integer t)->System.out.println(t);
					
				
			Arrays.asList(10,20,30,40).stream().map((Integer t)->t*2)
			.collect(Collectors.toList()).forEach((Integer t)->System.out.println(t));
			
	}
}