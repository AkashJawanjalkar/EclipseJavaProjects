package Object_class;

class test
{
	int x;
	test(int x)
	{
		this.x=x;	
	}
	public int returnHashcode()
	{
		return x*10000;
	}
	public boolean equals(Object obj)
	{
		test t =(test)obj;
		if(this.x=t.x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class equals {

	public static void main(String[] args) {
		test t1 = new test(100);
		test t2 = new test(200);
		System.out.println("hashcode of t1 "+System.identityHashCode(t1));
		System.out.println("hashcode of t2 "+System.identityHashCode(t2));
		
		if(t1.equals(t2))
		{
			System.out.println("Objcets are equal");
			System.out.println("user defined hashcode for t1 "+t1.hashCode());
			System.out.println("user defined hashcode for t2 "+t2.hashCode());
		}
		else
		{
			System.out.println("objcets are not equal");
			System.out.println("user defined hashcode for t1 "+t1.hashCode());
			System.out.println("user defined hashcode for t2 "+t2.hashCode());
		}
	}

}
