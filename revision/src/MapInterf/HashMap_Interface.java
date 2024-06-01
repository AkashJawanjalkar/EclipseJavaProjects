package MapInterf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Interface {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(12, "Shubh");
		map.put(8,"Saurabh");
		map.put(61, "Aniket");
		map.put(42,"Ani");
		map.put(71, "Shubh");
		map.put(23, "Swappy");
		map.put(523, "Rohit");
		map.put(312, "Mangu");
		
	
		Set<Map.Entry<Integer,String>> mdata = map.entrySet();
		
		for(Map.Entry<Integer,String> m:mdata)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
