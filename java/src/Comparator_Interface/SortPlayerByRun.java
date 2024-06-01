package Comparator_Interface;

import java.util.Comparator;

public class SortPlayerByRun implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		player p1 = (player)o1;
		player p2 = (player)o2;
		
		if(p1.getRun()>p2.getRun())
		{
			return 1;
		}
		else
			if(p1.getRun()<p2.getRun())
			{
				return -1;
			}
			else
			{
				return 0;
			}
	}

}
