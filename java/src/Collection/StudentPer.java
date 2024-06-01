package Collection;

public class StudentPer {

	private String name;
	private int id,per;
	
	public StudentPer()
	{
		
	}
	public StudentPer(String name, int id, int per)
	{
		this.name=name;
		this.id=id;
		this.per=per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPer() {
		return per;
	}
	public void setPer(int per) {
		this.per = per;
	}
	
}
