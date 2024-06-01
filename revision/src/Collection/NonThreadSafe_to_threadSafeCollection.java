package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonThreadSafe_to_threadSafeCollection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(123);
		al.add(1232);
		al.add(2121);
		al.add(2122);
		
		List list = Collections.synchronizedList(al);
		System.out.println(list);
	}

}
