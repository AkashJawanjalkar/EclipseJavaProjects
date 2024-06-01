package MapInterf;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Employee
{
	private int id,sal;
	private String name;
	public Employee()
	{
		
	}
	public Employee(String name, int id, int sal)
	{
		this.name = name ;
		this.id = id;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Struct_Dev_test {

	public static void main(String[] args) {
		LinkedHashMap<String,ArrayList<Employee>>map = new LinkedHashMap<String,ArrayList<Employee>>();
		
		ArrayList<Employee>al = new ArrayList<Employee>();
		al.add(new Employee("Rohit",1,12000));
		al.add(new Employee("Liran",2,10000));
		al.add(new Employee("Swappy",3,12400));
		
		ArrayList<Employee>al1 = new ArrayList<Employee>();
		al1.add(new Employee("Rohan",1,10000));
		al1.add(new Employee("Mangu",2,12300));
		al1.add(new Employee("Ani",3,10000));
		
		map.put("Dev", al);
		map.put("TEster", al1);
		
		Set<Map.Entry<String,ArrayList<Employee>>>mset = map.entrySet();
		
		for(Map.Entry<String, ArrayList<Employee>>m:mset)
		{
			String depName=m.getKey();
			System.out.println("Dep name is "+depName);
			ArrayList<Employee>empList=m.getValue();
			for(Employee e:empList)
			{
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
		}
	}

}
