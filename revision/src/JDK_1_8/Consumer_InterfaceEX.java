package JDK_1_8;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee
{
	private int id;
	private String name;
	public Employee(String name, int id)
	{
		this.name=name;
		this.id=id;
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

//class fetcEmp implements Consumer<Employee>
//{
//	public void accept(Employee t)
//	{
//		System.out.println(t.getId()+" "+t.getName());
//	}
//}
public class Consumer_InterfaceEX {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Ram",1));
		al.add(new Employee("shyam",2));
		al.add(new Employee("ABC",3));
		al.add(new Employee("pqr",4));
		al.add(new Employee("stv",5));
		
//		fetcEmp fe = new fetcEmp();
		//al.forEach(fe);
		
		
			
	al.forEach((Employee t)->System.out.println(t.getId()+" "+t.getName()));
		
		
	}

}
