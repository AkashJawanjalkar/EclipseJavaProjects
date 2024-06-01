package JDK_1_8;

import java.util.stream.Stream;

public class StreamOf {

	public static void main(String[] args) {
		
		Stream<Integer> s1 = Stream.of(10,20,30,40,50);
		s1.forEach(System.out::println);
	}

}
