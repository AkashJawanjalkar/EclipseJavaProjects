package Generics;
import java.util.*;
class data
{
	private int id;
	private String name;
	private float per;
	public data()
	{
		
	}
	public data(int id, String name , float per)
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	
}
public class GenApp {

	public static void main(String[] args) {
		ArrayList<data> al = new ArrayList<data>();
		al.add(new data(1,"Rohan",3.4f));
		al.add(new data(2,"kiran",12.12f));
		al.add(new data(3,"Mangu",12.2f));
		al.add(new data(4,"swappy",1.2f));
		
		for(data d:al)
		{
			System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getPer());
		}
	}
}