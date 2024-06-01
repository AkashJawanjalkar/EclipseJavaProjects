package MapInterf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Occurance {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Display Array values");
		for(int val:a)
		{
			System.out.println(val+"\t");
		}
		
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		System.out.println("Display occurance of values");
		for(int i=0;i<a.length;i++)
		{
			Integer count = map.get(a[i]);
			if(count == null)
			{
				count = new Integer(0);
			}
			++count;
			map.put(a[i], count);
		}
		Set<Map.Entry<Integer,Integer>> m = map.entrySet();
		for(Map.Entry<Integer, Integer>mv:m)
		{
			System.out.println(mv.getKey()+"\t"+mv.getValue());
		}	
	}
}