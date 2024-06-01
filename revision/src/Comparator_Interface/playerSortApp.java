package Comparator_Interface;

import java.util.ArrayList;
import java.util.Collections;

public class playerSortApp {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(new player(1,"Ram",1232));
		
		player p2 = new player(2,"shyam",1212);
		al.add(p2);
		
		player p3 = new player();
		p3.setId(3);
		p3.setName("kirann");
		p3.setRun(1111);
		al.add(p3);
		
		al.add(new player(4,"Mangesh",1221));
		al.add(new player(5,"Swapnil",876));
		
		System.out.println("before sort");
		for(Object obj:al)
		{
			player p = (player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
		
		sortPlayerById spi = new sortPlayerById();
		Collections.sort(al,spi);
		System.out.println("Player sorted by id");
		for(Object obj:al)
		{
			player p = (player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			
		}
		
		SortPlayerByRun spr = new SortPlayerByRun();
		Collections.sort(al,spr);
		System.out.println("Player sorted by run");
		for(Object obj:al)
		{
			player p = (player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}	
	}
}