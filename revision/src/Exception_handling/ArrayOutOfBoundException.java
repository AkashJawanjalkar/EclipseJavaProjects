package Exception_handling;

public class ArrayOutOfBoundException {

	public static void main(String[] args) {
		
		try
		{
		int a[] ={2,4,6,8,5};
		
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Exception is:"+a);
		}
		
	}

}
