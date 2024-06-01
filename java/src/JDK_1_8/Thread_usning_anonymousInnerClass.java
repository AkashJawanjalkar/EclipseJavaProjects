package JDK_1_8;

public class Thread_usning_anonymousInnerClass {

	public static void main(String[] args) {
		Thread t = new Thread()
		{
			public void run()
			{
				try 
				{
					for(int i=1;i<=5;i++)
					{
						System.out.println("i is "+i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println("Error id "+e);
				}
			}
		};
		t.start();
	}

}
