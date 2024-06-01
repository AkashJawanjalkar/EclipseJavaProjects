package JDK_1_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee01
{
	private int id;
	private String name;
	private int sal;
	public Employee01(String name, int id,int sal)
	{
		this.name=name;
		this.sal=sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
public class StreamApi_Emp {

	public static void main(String[] args) {
//		Employee01 emp1 = new Employee01("ABC",1,16000);
//		
//		List<Employee01> list =Arrays.asList(new Employee01("PQR",2,12000),new Employee01("xyz",3,18000),new Employee01("SWappy",4,10000),new Employee01("Mangu",5,12000));
//		
//		Stream<Employee01> stream1 = list.stream();
//		
//		Predicate<Employee01> p = new Predicate<Employee01>()
//				{
//					public boolean test(Employee01 t)
//					{
//						return t.getSal()>10000;
//					}
//				};
//				
//		Stream<Employee01> stream2 = stream1.filter(p);
//		
//		List<Employee01> rList = stream2.collect(Collectors.toList());
//		
//		Consumer<Employee01> c = new Consumer<Employee01>()
//				{
//					public void accept(Employee01 t)
//					{
//						System.out.println(t.getId()+" "+t.getName()+" "+t.getSal());
//					}
//				};
//				
//			rList.forEach(c);
		
		
		//Employee01 emp1 = new Employee01("ABC",1,16000);
		
		//List<Employee01> list =Arrays.asList(new Employee01("PQR",2,12000),new Employee01("xyz",3,18000),new Employee01("SWappy",4,10000),new Employee01("Mangu",5,12000));
		
		//Stream<Employee01> stream1 = Arrays.asList(new Employee01("PQR",2,12000),new Employee01("xyz",3,18000),new Employee01("SWappy",4,10000),new Employee01("Mangu",5,12000)).stream();
		
		//Predicate<Employee01> p = (Employee01 t)->t.getSal()>10000;
					
				
//		Stream<Employee01> stream2 = Arrays.asList(new Employee01("PQR",2,12000),
//				new Employee01("xyz",3,18000),new Employee01("SWappy",4,10000),
//				new Employee01("Mangu",5,12000)).stream().filter((Employee01 t)->t
//						.getSal()>10000);
		
//		List<Employee01> rList = Arrays.asList(new Employee01("PQR",2,12000),
//				new Employee01("xyz",3,18000),new Employee01("SWappy",4,10000),
//				new Employee01("Mangu",5,12000)).stream().filter((Employee01 t)->t
//						.getSal()>10000).collect(Collectors.toList());
		
		//Consumer<Employee01> c =(Employee01 t)->System.out.println(t.getId()+" "+t.getName()+" "+t.getSal());
					
				
		Arrays.asList(new Employee01("PQR",2,12000),new Employee01("xyz",3,18000),
				new Employee01("SWappy",4,10000),new Employee01("Mangu",5,12000))
		.stream().filter((Employee01 t)->t.getSal()>10000).collect(Collectors.toList())
		.forEach((Employee01 t)->System.out.println(t.getId()+" "+t.getName()+" "+t.getSal()));	
	}
}