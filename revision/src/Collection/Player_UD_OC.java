package Collection;

import java.util.Scanner;
import java.util.Vector;

public class Player_UD_OC {

	public static void main(String[] args) {
		Player_pojo p1 = new Player_pojo("ritesh",1,23000);
		Player_pojo p2 = new Player_pojo("rahul",2,3400);
		Player_pojo p3 = new Player_pojo("Ramesh",3,32432);
		
		Vector v = new Vector();
		v.add(p1);
		v.add(p2);
		v.add(p3);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter player id for search:");
		int pid = sc.nextInt();
		boolean b = false;
		for(Object obj:v)
		{
			Player_pojo p =(Player_pojo)obj;
			
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
			if(p.getId()==pid)
			{
				b=true;
			}
		}
		if(b)
		{
			System.out.println("player found");
		}
		else
		{
			System.out.println("Plyer not found");
		}	
	}
}