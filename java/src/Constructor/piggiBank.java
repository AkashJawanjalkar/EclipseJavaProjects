package Constructor;
import java.util.*;

class addAmount
{
	int addAmt;
	int pgAmt=50;
	int t;
	addAmount()
	{
		System.out.println("Amount is "+pgAmt);
	}
	addAmount(int add)
	{
		this.addAmt = add;
		t = addAmt+pgAmt;
		System.out.println("Total amt is "+t);
	}
}
public class piggiBank {
	public static void main(String xyz[])
	{
		addAmount a = new addAmount();
		addAmount a1 = new addAmount(35);
	}
}
