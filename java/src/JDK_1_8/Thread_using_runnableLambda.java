package JDK_1_8;

public class Thread_using_runnableLambda {

	public static void main(String[] args) {
		 new Thread(()->System.out.println("hey i am thread")).start();
				
	}

}
