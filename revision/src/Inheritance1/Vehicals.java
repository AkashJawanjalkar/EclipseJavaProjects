package Inheritance1;

import java.util.Scanner;

class vehi {
	protected String model;
	protected int regNo, vehSpe, fuelCap, fuelCons;
	protected int dc, fn, dis, time;
	
	public vehi(String model, int regNo, int vehSpe, int fuelCap, int fuelCons) {
		super();
		this.model = model;
		this.regNo = regNo;
		this.vehSpe = vehSpe;
		this.fuelCap = fuelCap;
		this.fuelCons = fuelCons;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public int getVehSpe() {
		return vehSpe;
	}

	public void setVehSpe(int vehSpe) {
		this.vehSpe = vehSpe;
	}

	public int getFuelCap() {
		return fuelCap;
	}

	public void setFuelCap(int fuelCap) {
		this.fuelCap = fuelCap;
	}

	public int getFuelCons() {
		return fuelCons;
	}

	public void setFuelCons(int fuelCons) {
		this.fuelCons = fuelCons;
	}

	void fuelNeeded(int dis) {
		this.dis = dis;
		fn = dis * fuelCons;
	}

	void distCover(int time) {
		this.time = time;
		dc = vehSpe * time;
	}

	void Display() {
		System.out.println("model\treg No\tveh Speed\tfuel Cap\tfuel Cons\tfeul Needed\tDist Cover");
		System.out.println(getModel() + "\t" + getRegNo() + "\t" + getVehSpe() + "\t\t" + getFuelCap() + "\t\t"
				+ getFuelCap() + "\t\t" + fn + "" + "\t\t" + dc);
	}
}

class truck extends vehi {
	int cw;

	truck(String model, int regNo, int vehSpe, int fuelCap, int fuelCons, int cw) {
		super(model, regNo, vehSpe, fuelCap, fuelCons);
		this.cw = cw;
	}

	void Display() {
		super.Display();
		System.out.println("Cargo Weight:");
		System.out.println(cw + "KG");
	}
}

class bus extends vehi {
	int NP;

	bus(String model, int regNo, int vehSpe, int fuelCap, int fuelCons, int pas) {
		super(model, regNo, vehSpe, fuelCap, fuelCons);
		this.NP = pas;
	}

	void Display() {
		super.Display();
		System.out.println("No of passenger:");
		System.out.println(NP);
	}
}

public class Vehicals {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter choice- 1.for Truck 2. for Bus");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			truck t = new truck("TATA", 2167, 80, 50, 10, 15000);
			t.distCover(5);
			t.fuelNeeded(100);
			t.Display();
			break;
		case 2:
			bus b = new bus("Icher", 1212, 100, 50, 12, 45);
			b.distCover(5);
			b.fuelNeeded(100);
			b.Display();
			break;
		default:
			System.out.println("Invalid");
		}
	}
}