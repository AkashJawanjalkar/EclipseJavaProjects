package Multithreading;

class Aa extends Thread
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("First thread is "+i);
				Thread.sleep(10000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}

class Bb extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=50;i++)
			{
				System.out.println("Second Thread is "+i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
		}
	}
}
public class thread_start_sleep {

	public static void main(String[] args) {
		Aa a1 = new Aa();
		a1.start();
		
		Bb b1 = new Bb();
		b1.start();
	}

}
