package Generics;

import java.util.ArrayList;

public class InstanceOf {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(new java.util.Date());
		al.add(5.4f);
		al.add(400);
		al.add(500);
		
		int sum =0;
		for(Object obj:al)
		{
			if(obj instanceof Integer)
			{
				sum=sum+(int)obj;
			}
		}
		System.out.println("Sum of all values is "+sum);
	}

}
