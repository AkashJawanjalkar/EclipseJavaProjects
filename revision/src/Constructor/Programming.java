package Constructor;

class Programing
{
	Programing()
	{
		System.out.println("I Love My Bike");
	}
	Programing(String name)
	{
		System.out.println("I Love "+name);
	}
}
public class Programming {

	public static void main(String[] args) {
		Programing p = new Programing();
		Programing p1 = new Programing("INDIA");
	}
}