package Object_class;

class square implements Cloneable
{
	int no;
	public void setdata(int x)
	{
		no=x;
	}
	public void showSq()
	{
		System.out.println("Square is "+no*no);
	}
	public square getsquare()throws CloneNotSupportedException
	{
		return (square)this.clone();
	}
}
public class Object_Cloning {

	public static void main(String[] args) {
		square s1 = new square();
		s1.setdata(10);
		square s2=s1;
		s2.setdata(5);
		
		s1.showSq();
	}

}
