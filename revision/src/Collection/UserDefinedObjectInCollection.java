package Collection;

import java.util.Vector;

class Employeecc
{
	private int id,sal;
	private String name;
	Employeecc()
	{
		
	}
	Employeecc (int id, String name, int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
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
public class UserDefinedObjectInCollection {

	public static void main(String[] args) {
	Vector v = new Vector();
	
	v.add(new Employeecc(1,"abc",12000));
	v.add(new Employeecc(2,"aqe",12000));
	
	
//	Employeecc e1 = new Employeecc(1,"abc",12000);
//	Employeecc e2 = new Employeecc(2,"asd",12000);
	
//	Employeecc e1 = new Employeecc();
//	e1.setId(1);
//	e1.setName("Ram");
//	e1.setSal(12000);
//	v.add(e1);
//	
//	Employeecc e2 = new Employeecc();
//	e2.setId(2);
//	e2.setName("Laxman");
//	e2.setSal(120000);
//	v.add(e2);
	
	for(Object obj:v)
	{
		Employeecc e =(Employeecc)obj;
		System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
	}
	
	}

}
