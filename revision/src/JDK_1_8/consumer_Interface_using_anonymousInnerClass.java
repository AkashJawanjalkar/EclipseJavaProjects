package JDK_1_8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class consumer_Interface_using_anonymousInnerClass {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(300);
		al.add(500);
		al.add(340);
		
		Consumer<Integer> c = new Consumer<Integer>()
				{
					public void accept(Integer t)
					{
						System.out.println(t);
					}
				};
				al.forEach(c);	
	}
}