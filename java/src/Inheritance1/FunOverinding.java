package Inheritance1;

import java.util.Vector;

abstract class  Abc 
{
	abstract void show();
}
class Zb extends Abc
{
	@Override
	void show() {
		System.out.println("Gerat ...!");	
	}	
}
class BA extends Abc
{
	@Override
	void show() {
		System.out.println("Todays Date ");	
	}
}
public class FunOverinding {
	public static void main(String[] args) {
		
		Abc abc = new Zb();
		abc.show();
		abc = new BA();
		abc.show();	
	}
}