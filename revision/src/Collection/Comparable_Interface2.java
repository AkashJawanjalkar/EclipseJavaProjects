package Collection;
import java.lang.*;
import java.util.*;

class player implements Comparable
{
	private int id,run;
	private String name;
	public player()
	{
		
	}
	public player(int id, String name, int run)
	{
		this.id=id;
		this.name = name;
		this.run = run;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		player p=(player)o;
		if(this.run>p.run)
		{
			return 1;
		}
		else if(this.run<p.run)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
public class Comparable_Interface2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		al.add(new player(1,"ram",1200));
		al.add(new player(2,"vishal",1000));
		al.add(new player(3,"Aniket",765));
		al.add(new player(4,"Kiran",345));
		al.add(new player(5,"Rohan",1250));
		
		System.out.println("Bofore Sort");
		for(Object obj:al)
		{
			player p = (player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
		
		Collections.sort(al);
		System.out.println("After sort");
		for(Object obj:al)
		{
			player p =(player)obj;
			System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getRun());
		}
	}
}