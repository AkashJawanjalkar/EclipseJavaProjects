package MapInterf;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree_MapInterf {

	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(2, "Shubh");
		map.put(1, "Shubh");
		map.put(23, "Swappy");
		map.put(52, "Rohit");
		map.put(312, "Mangu");
		map.put(8,"Saurabh");
		map.put(61, "Aniket");
		map.put(4,"Ani");
		
		
	
		Set<Map.Entry<Integer,String>> mdata = map.entrySet();
		for(Map.Entry<Integer,String> m:mdata)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
	}

}
