package Abstraction;

abstract class Ani
{
	abstract void makeSound() ;
}
class dog extends Ani
{
	public void makeSound()
	{
		System.out.println("bhobhobhobho.....");
	}
}
class cat extends Ani
{
	public void makeSound()
	{
		System.out.println("meo_meomeo_meo...");
	}
}
public abstract class Animal {

	public static void main(String[] args) {
		dog d = new dog();
		d.makeSound();
		
		cat c =  new cat();
		c.makeSound();
	}
}