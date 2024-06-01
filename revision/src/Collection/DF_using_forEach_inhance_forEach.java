package Collection;
//DF_using_forEach_inhance_forEach   and for each method of JDK 1.8
import java.util.Vector;

public class DF_using_forEach_inhance_forEach {

	public static void main(String[] args) {
		Vector v = new Vector();
				v.add(100);
				v.add(200);
				v.add(300);
				v.add(400);
				v.add(500);
				
//				for(Object obj:v)
//				{
//					System.out.println(obj);
//				}
				
				v.forEach((val)->System.out.println(val));
	}

}
