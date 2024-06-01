package Test;

public class revPrimeNO {

	public static void main(String[] args) {

		// 10 -> 5 ->15 // calloc malloc -> relloc -> free ->
		// double pointer **p
		//
		System.out.println("100 to 50 prime numbers");

		int start = 100, end = 50, temp;

//		while (start >= end) {
//			boolean f = true;
//			temp = start;
//			int j = 2;
//			while (j < temp) {
//				if (temp % j == 0) {
//					f = false;
//					break;
//				}
//				j++;
//			}
//
//			if (f)
//				System.out.println(start);
//
//			start--;
//		}
		
		int count=0;
		boolean f=true;
		for(int i=100;i>=50;i--)
		{
			f=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					f=false;
					
				}
			}
			if(f)
			{
				System.out.println(i);
			}
			
		}

	}

}
