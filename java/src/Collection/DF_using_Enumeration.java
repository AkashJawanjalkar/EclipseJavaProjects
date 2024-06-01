package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class DF_using_Enumeration {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		Enumeration enm = v.elements();
		
		while(enm.hasMoreElements())
		{
			Object obj = enm.nextElement();
			System.out.println(obj);
		}
	}

}
