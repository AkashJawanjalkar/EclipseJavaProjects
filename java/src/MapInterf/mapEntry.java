package MapInterf;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapEntry {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Kiran");
		map.put(2,"Swapnil");
		map.put(3,"Rohan");
		
//		Collection c = map.values();
//		for(Object obj:c)
//		{
//			System.out.println(obj);
//		}
		
		Set<Map.Entry> mes = map.entrySet();
		
		for(Map.Entry m:mes)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
