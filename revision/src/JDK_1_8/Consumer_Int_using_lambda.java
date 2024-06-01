package JDK_1_8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_Int_using_lambda {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(30);
		al.add(400);
		al.add(230);
		
					
				al.forEach((Integer t)->System.out.println(t));
	}

}
