package Collection;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		 
		int choice,value;
		
		do
		{
			System.out.println("1.PUSH element in stack");
			System.out.println("2.view all element from stack");
			System.out.println("3.display element from stack");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter data in stack");
				value = sc.nextInt();
				s.push(value);
				break;
			case 2:
				boolean b = s.isEmpty();
				if(b)
				{
					System.out.println("Stack is empty");
				}
				else
				{
					System.out.println("remove value"+s.pop());
				}
				break;
			case 3:
				b = s.empty();
				if(b)
				{
					System.out.println("there is no element");
				}
				else
				{
					ListIterator li = s.listIterator(s.size());
					while(li.hasPrevious())
					{
						Object obj = li.previous();
						System.out.println(obj);
					}
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
		while(true);
	}
}