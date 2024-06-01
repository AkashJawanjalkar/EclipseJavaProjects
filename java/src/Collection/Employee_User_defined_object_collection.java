package Collection;

import java.util.Vector;



public class Employee_User_defined_object_collection 
{

	public static void main(String[] args) 
	{
		Employee_pojo emp1 = new Employee_pojo();
		emp1.setId(1);
		emp1.setName("kiran");
		emp1.setSal(24000);
		
		Employee_pojo emp2 = new Employee_pojo();
		emp2.setId(2);
		emp2.setName("mangesh");
		emp2.setSal(22000);
		
		Employee_pojo emp3 = new Employee_pojo();
		emp3.setId(3);
		emp3.setName("Ram");
		emp3.setSal(23300);
		
		Vector v = new Vector();
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		
		for(Object obj:v)
		{
			Employee_pojo e = (Employee_pojo)obj;
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			
		}
	}
}