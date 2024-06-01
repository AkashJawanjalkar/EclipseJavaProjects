package Exception_handling;

public class ClassNotFoundException {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("java.lang.Thread");
				System.out.println("hello");
		} 
		catch (Exception e) {
			System.out.println("Error :"+e);
			
		}
	}
}