package Jan1PDF;

import java.util.*;

class product
{
	private
	int id,qty,rate;
	String name;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
class CalBill
{
	int sum=0;
	void cal(product ...p)
	{
		
		for(int i=0;i<p.length;i++)
		{
			sum = sum + (p[i].getRate()*p[i].getQty());
		}
		
		System.out.println("-----------------Welcome to Our Store----------------");
		System.out.println("The Total Final bill of customer is:");
		System.out.println("\nPro.Id\tName\tQuantity\tRate\tTotal");
		System.out.println("_____________________________________________________"); 
		
		for(int i=0;i<p.length;i++)
		{
		int T = p[i].getRate()*p[i].getQty();
		System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getQty()+"\t\t"+p[i].getRate()+"\t"+T);
		}
		
		System.out.println("______________________________________________________");
		System.out.println("\tThe Grand Total is: \t\t"+sum);
		System.out.println("______________________________________________________");
		System.out.println("----------------Thank You-Visit Again-----------------");
	}
}
public class jan11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id, qty, rate;
		String name;
		
		product p[] = new product[3];
		for(int i=0;i<p.length;i++)
		{
			p[i] = new product();
			System.out.println("enter id, name, Quantity and rate of product:");
			id = sc.nextInt();
			p[i].setId(id);
			
			sc.nextLine();
			name = sc.nextLine();
			p[i].setName(name);
			
			qty = sc.nextInt();
			p[i].setQty(qty);
			
			rate = sc.nextInt();
			p[i].setRate(rate);
		}
		
		CalBill c = new CalBill();
		c.cal(p);
	}
}