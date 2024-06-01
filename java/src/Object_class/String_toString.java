package Object_class;

class Empl
{
	private int id;
	private String name;
	private int sal;
	
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
	
	public String toString()
	{
		return "{"+name+","+id+","+sal+"}";
	}
}
public class String_toString {

	public static void main(String[] args) {
		Empl e1 = new Empl();
		e1.setId(1);
		e1.setName("Ram");
		e1.setSal(12000);
		
		System.out.println(e1);
	}

}
