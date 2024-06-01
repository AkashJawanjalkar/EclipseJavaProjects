package JDK_1_8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		Stream<Integer> stream1 = list.stream();
		
//		Iterator<Integer> i = stream1.iterator();
//		while(i.hasNext())
//		{
//			Object value = i.next();
//			System.out.println(value);
//		}
		
		stream1.forEach(System.out::println);
	}
}