package JDK_1_8;

import java.util.stream.Stream;

public class StreamObject_StreamBuilder {

	public static<T> void main(String[] args) {
		
		Stream.Builder<Integer> builder = Stream.builder();
		
		Stream<Integer> s1 = builder.add(10).add(20).add(30).add(40).add(50).build();
		
		s1.forEach(System.out::println);
	}

}
