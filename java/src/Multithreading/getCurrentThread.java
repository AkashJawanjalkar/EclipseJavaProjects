package Multithreading;

public class getCurrentThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("Thread name is "+tname);
	}

}
