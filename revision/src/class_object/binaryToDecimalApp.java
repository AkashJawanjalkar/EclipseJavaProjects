package class_object;
import java.util.*;
public class binaryToDecimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner xyz = new Scanner(System.in);
		int decimal=0,base=1;
      System.out.println("Enter the number");
      int no=xyz.nextInt();
      
    while(no>0)
    {
    	int rem = no%10;
		decimal = decimal+rem*base;
		no=no/10;
		base =base*2;
    }
			
			System.out.printf("Decimal:%d",decimal);
		}
	
	}


