package JDK_1_8;


interface ABC
{
	static void show()
	{
		System.out.println("i am show method of ABC");
	}
}
public class Interface_with_static_method {

	public static void main(String[] args) {
		ABC.show();
	}

}
