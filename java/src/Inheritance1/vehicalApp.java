package Inheritance1;

class vehical
{
	String type;
	int brandId;
	vehical(int brandId,String type)
	{
		this.brandId=brandId;
		this.type=type;
	}
	void display()
	{
		System.out.println("Brand Id\tType");
		System.out.println(brandId+"\t\t"+type);
	}
}
class Maruti extends vehical
{
	String brandName;
	int Price;
	Maruti(int brandId, String type, String brandName, int Price) 
	{
		super(brandId, type);
		this.brandName=brandName;
		this.Price=Price;
	}
	void display()
	{
		super.display();
		System.out.println("\nBrand Name\tPrice");
		System.out.println(brandName+"\t\t"+Price);
	}
}
class Maruti800 extends Maruti
{
	String color;
	int speed;
	Maruti800(int brandId, String type, String brandName, int Price,int speed,String color) 
	{
		super(brandId, type, brandName, Price);
		this.color=color;
		this.speed=speed;
	}
	void display()
	{
		super.display();
		System.out.println("\nColor\t\tSpeed");
		System.out.println(color+"\t\t"+speed);
		//System.out.println(color+"\t"+speed+"\t"+brandId+"\t"+brandName+"\t"+Price+"\t"+type);
	}
}
public class vehicalApp {

	public static void main(String[] args) {
		Maruti800 m = new Maruti800(1, "Sport", "Suzuki", 900000, 120, "White");
		m.display();
	}
}