package Object_class;

import java.util.LinkedHashSet;

class Employee
{
	private int id;
	private String name;
	Employee(int id, String name)
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
	
}
public class setColl_dataStore {

	public static void main(String[] args) {
		LinkedHashSet <Employee> set = new LinkedHashSet <Employee>();
		
		set.add(new Employee(1,"ram"));
		set.add(new Employee(2,"Shyam"));
		set.add(new Employee(3,"ramesh"));
		set.add(new Employee(4,"ganesh"));
		set.add(new Employee(1,"ram"));
		
		for(Employee e:set)
		{
			System.out.println(e.getId()+"\t"+e.getName()+"\t");
		}
	}

}
