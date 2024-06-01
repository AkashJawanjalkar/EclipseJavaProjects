package Jan1PDF;

import java.util.Scanner;

class Circle
{	
	float radius,pi=3.14f;
	void setRadius(float radius)
	{
		this.radius=radius;
	}
	void showArea()
	{
		float Area=pi*radius*radius;
		System.out.println("area of circle is "+Area);
	}
}

public class jan1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		{
			float radius;
			System.out.println("Enter radius of circe:");
			radius = sc.nextFloat();
			
			Circle c = new Circle();
			c.setRadius(radius);
			c.showArea();
		}
	}

}
