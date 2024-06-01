package Exception_handling;

public class NumberFormatException {

	public static void main(String[] args) {
		try
		{
		String name="asdf123";
		int a =Integer.parseInt(name);
		System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("Exception is: "+e);
		}
		
	}

}
