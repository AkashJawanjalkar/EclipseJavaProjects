package Constructor;

		import java.util.*;

		class RectArea
		{
			int le,br,area;
			RectArea()
			{
			int le=0;
			int br=0;
			}
			
			RectArea(int le,int br)
			{
			this.le=le;
			this.br=br; 
			area=le*br;
			System.out.println("Area is:"+area);
			}
			
			RectArea(int area)
			{
				this.le=area;
				this.br=area;
				area=le*br;
				System.out.println("Area is:"+area);
			}
		}

		public class RectL {

			public static void main(String[] args)
			{
			Scanner sc = new Scanner(System.in);
			RectArea r = new RectArea();
			RectArea r1 = new RectArea(4,5);
			RectArea r2 = new RectArea(5);
			}
		}