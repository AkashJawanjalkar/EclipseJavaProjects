package Constructor;
import java.util.*;
class Rect
{
	int length,bredth,area;
	Rect()
	{
			length = 0;
			bredth = 0;
			area = length*bredth;
			System.out.println("area is "+area);
	}
	Rect(int len,int bre)
	{
		length = len;
		bredth = bre;
		area = length*bredth;
		System.out.println("area 2 is "+area);
	}
	Rect(int area)
	{
		this.length = area;
		this.bredth = area;
		area = length * bredth;
		System.out.println("area 3 is "+area);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
		}
		
		Rect r = new Rect();
		Rect r2 = new Rect(10,20);
		Rect r3 = new Rect(5);
	}
}