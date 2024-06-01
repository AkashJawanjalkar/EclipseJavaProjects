package Collection;

public class ObjectClassArrApp {

	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0]=100;
		obj[1]=new java.util.Date();
		obj[2]="good";
		obj[3]=5.4f;
		obj[4]=false;
		
		System.out.println("Display All values");
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}	
	}
}