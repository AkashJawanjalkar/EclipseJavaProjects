package Collection;

import java.util.*;
class Test {
	protected int no;
	
	Test(){
		super();
	}
	
	protected void finalize() {
	
			System.out.println("Hi i an Garbage Collection");
	}
}
public class ListClassApp {

		ListClassApp(){
			super();
		}
		public static void main(String[] args) {
			
				
				Test t1 = new Test();
				Test t2 = new Test();
				t1.no=343;
				
				t2=null;
				System.gc();
				
			
		}
		
}
