package Collection;

public class Player_pojo {

	private String name;
	private int id,run;
	
	public Player_pojo()
	{
		
	}
	public Player_pojo(String name,int id,int run)
	{
		this.name=name;
		this.id=id;
		this.run=run;
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
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}	
}
