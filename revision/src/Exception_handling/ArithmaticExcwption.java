package Exception_handling;

public class ArithmaticExcwption {

	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		
		try 
		{
			int c= a/b;
			System.out.println("Result is "+ c);
		}
		catch(Exception e)
		{
			System.out.println("Please enter valid Intergers:" + e);
		}
	}

}
