package Abstraction;
interface Nokia{
	 void model1200();
	 void modelWindows();	
}
interface Apple{
	void model1200();
	void modelSE();
}
class Dealer implements Nokia,Apple{

	
	public void model1200() {
		// TODO Auto-generated method stub
		
	}

	
	public void modelWindows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modelSE() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
class MobileShop extends Dealer{

	
	public void model1200() {
		// TODO Auto-generated method stub
		
	}
	
}
public class TightCuppling {

	public static void main(String[] args) {
		
		
		
	}
}
