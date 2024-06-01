package JDK_1_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi_Example {

	public static void main(String[] args) {
		
//usning normal arraylist sort
		
//		List<Integer> List = Arrays.asList(1,4,3,5,7,8,9,78,34,54,12);
//				List<Integer>newList=new ArrayList<Integer>();
//		for(Integer val:List)
//		{
//			if(val%2==0)
//			{
//				newList.add(val);
//			}
//		}
//		System.out.println("Display even number");
//		newList.forEach((value)->System.out.println(value));
		
		
//Using Stream Api filter 
		
//		List<Integer> list = Arrays.asList(12,43,45,6,7898,56,23,12,3,2);
//		Stream<Integer>stream1 = list.stream();
//		
//		 Predicate<Integer> p = new Predicate<Integer>()
//				{
//			 		public boolean test(Integer t)
//			 		{
//			 			return t%2==0;
//			 		}
//				};
//			Stream<Integer>stream2=stream1.filter(p);
//			List<Integer> resultList = stream2.collect(Collectors.toList());
//			
//			Consumer<Integer> c = new Consumer<Integer>()
//					{
//				public void accept(Integer t)
//				{
//					System.out.println(t);
//				}
//					};
//					
//				resultList.forEach(c);
		
		
		
		//List<Integer> list = Arrays.asList(12,43,45,6,7898,56,23,12,3,2);
		//Stream<Integer>stream1 = Arrays.asList(12,43,45,6,7898,56,23,12,3,2).stream();
		
		 //Predicate<Integer> p = (Integer t)->t%2==0;
			 		
		//Stream<Integer>stream2=Arrays.asList(12,43,45,6,7898,56,23,12,3,2).stream().filter(p);
		 
		//List<Integer> resultList = Arrays.asList(12,43,45,6,7898,56,23,12,
		//		 3,2).stream().filter((Integer t)->t%2==0).collect(Collectors.toList());
			
			//Consumer<Integer> c =(Integer t)->System.out.println(t);
				
		Arrays.asList(12,43,45,6,7898,56,23,12,3,2).stream()
		.filter((Integer t)->t%2==0).collect(Collectors.toList())
		.forEach((Integer t)->System.out.println(t));
		
		
	}
	
}