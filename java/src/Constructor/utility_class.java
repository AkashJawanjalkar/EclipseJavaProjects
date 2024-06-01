package Constructor;

import java.util.*;
final class Demo{
	
	private Demo() {
		
	}
	static void printTable(int no) {
		System.out.println("Table is:");
		for(int i=1;i<=10;i++) {
			
				System.out.println((no*i));
		}
	}
}
public class utility_class {

	public static void main(String[] args) {

		int no=5;
		Demo.printTable(no);
	}

}
