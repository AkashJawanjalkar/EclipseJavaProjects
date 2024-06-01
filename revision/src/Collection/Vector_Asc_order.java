package Collection;

import java.util.Vector;

public class Vector_Asc_order {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(12);
		v.add(54);
		v.add(27);
		v.add(16);
		v.add(84);
		v.add(64);
		
		for(int i=0;i<v.size();i++)
		{
			for(int j=0;j<v.size();j++)
			{
				if((int)v.get(i)<(int)v.get(j))
				{
					int temp =  (int)v.get(i);
					v.set(i, v.get(j));
					v.set(j, temp);
				}
			}
		}
		
		
			System.out.println(v);
		
	}

}
