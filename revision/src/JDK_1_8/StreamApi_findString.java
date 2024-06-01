package JDK_1_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi_findString {

	public static void main(String[] args) {
//		List<String> list = Arrays.asList("ram","shyam","dinesh","ganesh","rupesh","mahesh");
//		Stream<String> stream1 = list.stream();
//		
//		Predicate<String> p = new Predicate<String>()
//				{
//			public boolean test(String t)
//			{
//				return t.endsWith("sh");
//			}
//				};
//				
//			Stream<String>stream2 = stream1.filter(p);
//			List<String> resultList = stream2.collect(Collectors.toList());
//			
//			Consumer<String> c = new Consumer<String>()
//					{
//				public void accept(String t)
//				{
//					System.out.println(t);
//				}
//					};
//					
//			resultList.forEach(c);
				
					
			Arrays.asList("ram","shyam","dinesh","ganesh","rupesh","mahesh").stream()
			.filter((String t)->t.endsWith("sh")).collect(Collectors.toList()).forEach
			((String t)->System.out.println(t));
	}
}