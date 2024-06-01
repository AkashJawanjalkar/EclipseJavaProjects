package Collection;
import java.util.*;
public class LinkedListSearchval {

	public static void main(String[] args) {
		LinkedList lst = new LinkedList();
		lst.add(100);
		lst.add(200);
		lst.add(300);
		lst.add(400);
		lst.add(500);
		
		for(Object obj:lst)
		{
			System.out.println(obj);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for search");
		int value = sc.nextInt();
		boolean b = lst.contains(value);
		if(b)
		{
			System.out.println("Value found");
		}
		else
		{
			System.out.println("Value not found");
		}
	}
}