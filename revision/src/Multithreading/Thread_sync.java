package Multithreading;

class Table01
{
	int no;
	synchronized void show (int x)
	{
		try 
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d X %d =  %d \n",i,x,i*x);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("Error is "+e);
		}
	}
}
class two2 extends Thread
{
	Table01 table;
	public void setTable(Table01 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.show(2);
	}
}
class three3 extends Thread
{
	Table01 table;
	public void setTable(Table01 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.show(3);
	}
}
public class Thread_sync {

	public static void main(String[] args) {
		Table01 t1 =  new Table01();
		two2 tw = new two2();
		tw.setTable(t1);
		tw.start();
		
		three3 th = new three3();
		th.setTable(t1);
		th.start();
	}

}
