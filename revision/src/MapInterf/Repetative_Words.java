package MapInterf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Repetative_Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String data");
		String data = sc.nextLine();
		String words[] = data.split(" ");
		
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(String s:words)
		{
			Integer count=map.get(s);
			if(count==null)
			{
				count=new Integer(0);
			}
			++count;
			map.put(s, count);
		}
		Set<Map.Entry<String,Integer>>set=map.entrySet();
		for(Map.Entry<String, Integer>m:set)
		{
			if(m.getValue()>1)
			{
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}
	}
}