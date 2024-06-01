package MapInterf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Tournament {

	public static void main(String[] args) {
		LinkedHashMap<String,ArrayList<String>>map = new LinkedHashMap<String,ArrayList<String>>();
		
		ArrayList <String>al = new ArrayList<String>();
		
		al.add("Dhoni");
		al.add("Rohit");
		al.add("viran");
		al.add("Yuvraj");
		
		ArrayList<String>al1 = new ArrayList<String>();
		al1.add("Warner");
		al1.add("steve");
		al1.add("finch");
		al1.add("Maxwell");
		
		map.put("india", al);
		map.put("Aus", al1);
		
		Set<Entry<String,ArrayList<String>>> mset = map.entrySet();
		
		for(Map.Entry<String, ArrayList<String>>m:mset)
		{
			String teamName = m.getKey();
			ArrayList<String>plist=m.getValue();
			System.out.println("\nteam name "+teamName);
			System.out.println("==============================");
			
			for(String playerName:plist)
			{
				System.out.println(playerName);
			}
		}
		
	}

}
