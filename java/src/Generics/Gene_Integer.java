package Generics;

import java.util.ArrayList;

public class Gene_Integer {

	public static void main(String[] args) {
		ArrayList <Integer>al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(300);
		int sum =0;
		for(Integer obj:al)
		{
			sum= sum+obj;
		}
		System.out.println("Sum of all values "+sum);
		
	}

}
