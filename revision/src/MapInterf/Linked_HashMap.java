package MapInterf;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_HashMap {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(71, "Shubh");
		map.put(23, "Swappy");
		map.put(523, "Rohit");
		map.put(12, "Shubh");
		map.put(8,"Saurabh");
		map.put(61, "Aniket");
		map.put(42,"Ani");
		map.put(312, "Mangu");
		
		
		
		Set<Map.Entry<Integer,String>> mdata = map.entrySet();
		for(Map.Entry<Integer,String>m:mdata)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
	}

}
