package MapInterf;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Struct_se_fe {

	public static void main(String[] args) {
		LinkedHashMap<String,LinkedHashMap<Integer,String>> map = new LinkedHashMap<String,LinkedHashMap<Integer,String>>();
		
		LinkedHashMap<Integer,String>feStud = new LinkedHashMap<Integer,String>();
		feStud.put(1, "Ram");
		feStud.put(2, "Shyam");
		feStud.put(3, "ganesh");
		feStud.put(3, "dinesh");
		
		LinkedHashMap<Integer,String>seStud = new LinkedHashMap<Integer,String>();
		seStud.put(1, "kiran");
		seStud.put(2, "mangu");
		seStud.put(3, "swappy");
		seStud.put(4, "Ani");
		
		map.put("fe", feStud);
		map.put("SE", seStud);
		
		Set<Map.Entry<String,LinkedHashMap<Integer,String>>> mset = map.entrySet();
		
		for(Map.Entry<String, LinkedHashMap<Integer,String>>m:mset)
		{
			String depName = m.getKey();
			LinkedHashMap<Integer,String>classData=m.getValue();
			System.out.println("dep name is "+depName);
			
			Set<Map.Entry<Integer, String>>imset=classData.entrySet();
			for(Map.Entry<Integer, String>ims:imset)
			{
				System.out.println(ims.getKey()+"\t"+ims.getValue());
			}
		}
	}

}
