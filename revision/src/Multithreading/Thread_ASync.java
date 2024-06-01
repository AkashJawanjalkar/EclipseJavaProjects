package Multithreading;

class Table
{
	void showTable(int x)
	{
	try
	{
		for(int i=1;i<=10;i++)
		{
			System.out.printf("\n%d X %d = %d",i,x,i*x);
			Thread.sleep(1000);
		}
	}
	catch(Exception e)
	{
		System.out.println("Error is "+e);
	}
	}
}
class two extends Thread
{
	Table table;
	public void setTable(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showTable(2);
	}
}
class three extends Thread
{
	Table table;
	public void setTable(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showTable(3);
	}
}
public class Thread_ASync {

	public static void main(String[] args) {
		Table t1 = new Table();
		two tw = new two();
		tw.setTable(t1);
		tw.start();
		
		three th = new three();
		th.setTable(t1);
		th.start();
	}

}
