package JDK_1_8;
import java.util.ArrayList;
import java.util.function.Consumer;

class Myconsum implements Consumer<Integer>
{
	public void accept(Integer t)
	{
		System.out.println(t);
	}
}


public class Cmsumer_interface_implements {
	public static void main(String[] xyz)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(300);
		al.add(400);
		
		Myconsum m = new Myconsum();
		al.forEach(m);
		
	}
}
