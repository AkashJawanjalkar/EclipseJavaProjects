package JDK_1_8;

import java.util.Optional;
import java.util.Scanner;

class Employees1
	{
		private int id;
		private String name;
		
		public Employees1() 
		{
			super();

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

public class Optional_Class {
	public static void main(String[] args) {
	
		Employees1 emp[] = new Employees1[5];
		Scanner xyz = new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{		
			emp[i] = new Employees1();
			System.out.println("Enter name id of employee");
			String name = xyz.nextLine();
			emp[i].setName(name);
			
			int id = xyz.nextInt();
			emp[i].setId(id);
			xyz.nextLine();
		}
		
		System.out.println("Display all employee");
		Optional<Employees1> o = null;
		for(Employees1 e:emp)
		{
			o = Optional.ofNullable(e);
			if(!o.isEmpty())
			{
				o = o.filter((Employees1 t)->t.getId()==3);
				if(o.isPresent())
				{
					e = o.get();
					System.out.println(e.getId()+"\t"+e.getName());
				}
			}
		}
	}
}