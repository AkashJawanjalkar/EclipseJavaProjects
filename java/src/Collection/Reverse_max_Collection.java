package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_max_Collection {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		System.out.println("before reverse"+al);
		Collections.reverse(al);
		System.out.println("After revser"+al);
		Object max = Collections.max(al);
		System.out.println("max is"+ max);
		
	}

}
