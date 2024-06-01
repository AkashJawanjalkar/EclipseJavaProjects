package Jan1PDF;
import java.util.*;

class Player
{
	private
		int id,run;
		String name;
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public void setId(int id)
		{
			this.id=id;
		}
		public int getId()
		{
			return id;
		}
		public int getRun() 
		{
			return run;
		}
		public void setRun(int run) 
		{
			this.run = run;
		}
}
class Team
{
	void addPlayer(Player ...p)
	{
		System.out.println("Name\tid\tRun");
		System.out.printf("____________________");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getName()+"\t"+p[i].getId()+"\t"+p[i].getRun());
		}
	}
}
public class jan12 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,run;
		String name;
		
		Player p[] = new Player[3];
		System.out.println("enter Player details");
		for(int i=0;i<p.length;i++)
		{
			p[i] = new Player();
			System.out.println("Enter Player name, id and Run:");
			name = sc.nextLine();
			p[i].setName(name);
			
			id = sc.nextInt();
			p[i].setId(id);
			
			run = sc.nextInt();
			p[i].setRun(run);
			
			sc.nextLine();
		}
		Team t = new Team();
		t.addPlayer(p);
	}
}