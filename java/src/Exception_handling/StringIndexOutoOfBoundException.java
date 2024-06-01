package Exception_handling;

public class StringIndexOutoOfBoundException {

	public static void main(String[] args) {
		try
		{
		String name = "pranit";
		 System.out.println(name.charAt(8));
		}
		catch(StringIndexOutOfBoundsException s)
		{
			System.out.println("Exception is:"+s);
		}
	}
}