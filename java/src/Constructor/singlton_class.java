package Constructor;

class singlton
{
	private static singlton s=null;
	private singlton()
	{
		
	}
	public static singlton getInstance()
	{
		if(s == null)
		{
			s = new singlton();
			return s;
		}
		else {
			return s;
		}
	}
}
public class singlton_class {

	public static void main(String[] args) {
		singlton s1 = singlton.getInstance();
		System.out.println("reference of obj "+s1);
		
		singlton s2 =  singlton.getInstance();
		System.out.println("reference of obj "+s2);
	}
}