package Object_class;

import java.util.LinkedHashSet;

class Employe
{
	private int id;
	private String name;
	
	Employe (int id,String name)
	{
		this.id=id;
		this.name=name;
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
	public int hashCode()
	{
		return id*1000;
	}
	public boolean equals(Object obj)
	{
		Employe e =(Employe)obj;
		if(this.id==e.id && this.name.equals(e.name))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class UserDefined_Hashcode {

	public static void main(String[] args) {
		LinkedHashSet<Employe> set = new LinkedHashSet<Employe>();
		
		set.add(new Employe(1,"Ram"));
		set.add(new Employe(2,"shyam"));
		set.add(new Employe(1,"Ram"));
		set.add(new Employe(3,"ganesh"));
		set.add(new Employe(1,"Ram"));
		
		for(Employe e:set)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+System.identityHashCode(e));
		}
	}

}
