package Inheritance1;

class Interest
{
	int pAmt,iRate,Dur;
	void setPRD(int pAmt, int iRate,int Dur)
	{
		this.pAmt=pAmt;
		this.iRate=iRate;
		this.Dur=Dur;
	}
}
class CalInterest extends Interest
{
	void CalInt()
	{
		int si = pAmt*iRate*Dur/100;
		//int ci = (int) (pAmt*Math.pow(1+iRate/Dur, Dur*iRate));
		System.out.println("Simple interest is:"+si);
		//System.out.println("Compound interest is:"+ci);
	}
}
public class Simple_Interest {

	public static void main(String[] args) {
		int pAmt=100000;
		int rate=12;
		int Dur=3;
		CalInterest c = new CalInterest();
		c.setPRD(pAmt, rate, Dur);
		c.CalInt();
	}
}