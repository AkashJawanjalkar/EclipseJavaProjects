package Inheritance1;

class AreaApp
{
	int rad,len,bre;
		void setRad(int rad)
		{
			this.rad=rad;
		}
		void setRad(int len, int bre)
		{
			this.len=len;
			this.bre=bre;
		}
}
class circle extends AreaApp
{
	void showArea()
	{
		float area=(float) (3.14)*rad*rad;
		System.out.println("Area Of Circle is "+area);
	}
}
class rectangle extends AreaApp
{
	void showArea()
	{
		float area = len*bre;
		System.out.println("Area Of Rectangle is "+area);
	}
}
public class Area {

	public static void main(String[] args) {
		circle c = new circle();
		c.setRad(5);
		c.showArea();
		rectangle r = new rectangle();
		r.setRad(3, 5);
		r.showArea();
	}
}