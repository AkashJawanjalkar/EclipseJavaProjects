package Comparator_Interface;

public class player 
{
	private int id, run;
	String name;
	public player()
	{
		
	}
	public player(int id, String name, int run)
	{
		this.id=id;
		this.name=name;
		this.run=run;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
