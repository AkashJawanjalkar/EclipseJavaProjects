package MapInterf;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		//LinkedHashMap map =  new LinkedHashMap();
		HashMap map = new HashMap();
		map.put(1,"Kiran");
		map.put(2,"Swapnil");
		map.put(3,"Mangesh");
		map.put(4,"Mangu");
		map.put(5,"Rohit");
		
		//Set keys = map.keySet();
		Collection c = map.values();
		for(Object obj:c)
		{
			//Object value = map.get(key);
			System.out.println(obj);
		}
		
		//Object obj = map.get(7);
		//boolean b = map.containsKey(3);
		//boolean b = map.containsValue("Rohi");
//		if(b)
//		{
//			System.out.println("data found");
//		}
//		else
//		{
//			System.out.println("data not found");
//		}
//		Object data = map.get(2);
//		System.out.println(data);
	}
}