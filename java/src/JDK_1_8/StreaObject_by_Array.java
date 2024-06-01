package JDK_1_8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreaObject_by_Array {

		public static<T> void main(String xyz[]) {
			
			int a[] = new int[] {10,20,30,40,50};
			IntStream s1 = Arrays.stream(a);
			
			s1.forEach(System.out::println);
	}
}