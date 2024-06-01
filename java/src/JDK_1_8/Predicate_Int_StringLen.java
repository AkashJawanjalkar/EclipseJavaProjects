package JDK_1_8;

import java.util.function.Predicate;

public class Predicate_Int_StringLen {

	public static void main(String[] args) {
		
		System.out.println(((Predicate<String>)(String t)->t.length()<=20).and((String t)->
		t.length()>=4).test("Jay  ShriRam")?"String length in between 4-20"
				:"String length not in between 4-20");
	}

}
