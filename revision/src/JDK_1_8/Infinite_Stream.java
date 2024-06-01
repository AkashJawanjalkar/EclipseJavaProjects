package JDK_1_8;

import java.util.stream.Stream;

public class Infinite_Stream {

	public static<T> void main(String[] args) {
		
//		Stream.iterate(2, (Integer n)->n*n).limit(5)
//		.forEach((value)->System.out.println(value));

		Stream <Integer> s1 = Stream.iterate(2, (Integer n)->n*n);
		Stream<Integer> s2 = s1.limit(5);
		s2.forEach(System.out::println);
		
	}

}
