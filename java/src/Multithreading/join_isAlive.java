package Multithreading;

class A extends Thread
{
	public void run()
	{
		try
		{
		for(int i=1;i<=5;i++)
		{
			System.out.println("First thread is "+i+"\t"+this.isAlive());
			if(i==3)
			{
				stop();
			}
			Thread.sleep(10000);
		}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
	
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Second Thread is "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex);
		}
	}
}
public class join_isAlive {

	public static void main(String[] args)throws InterruptedException {
		A a1 = new A();
		a1.start();
		a1.join();
		System.out.println("Now status of first thread "+a1.isAlive());
		B b1 = new B();
		b1.start();
	}

}
