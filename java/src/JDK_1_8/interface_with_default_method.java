package JDK_1_8;

interface ABCD
{
	default void show()
	{
		System.out.println("i am default method of interface");
	}
}
class mno implements ABCD
{
	
}
public class interface_with_default_method {

	public static void main(String[] args) {
		mno m = new mno();
		m.show();
	}

}
