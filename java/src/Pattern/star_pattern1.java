package Pattern;

public class star_pattern1 {

	public static void main(String[] args) {
		int n=1,u=n;
		char c='A',t=c;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<5;j++)
		{
			if(j<=i) 
			{
			if(i%2==1)
			{
				System.out.print(n+" ");
				n++;
			}
			else 
			{
			System.out.print(c+" ");
			c++;
			}
			}
		}
		n=u;
		c=t;
		System.out.println("\n");
	}
}
}
