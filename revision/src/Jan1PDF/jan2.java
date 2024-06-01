package Jan1PDF;

import java.util.Scanner;

class Rectangle1
{
	int length,width,Area;
	void Setdata(int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	void showArea()
	{
		Area= length*width;
		System.out.println("Area of Rectangle is: "+Area);
	}
}
public class jan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int length,width;
		System.out.println("Enter length and width of rectangle:");
		length = sc.nextInt();
		width = sc.nextInt();
		
		Rectangle1 r = new Rectangle1();
		r.Setdata(length, width);
		r.showArea();
	}

}
