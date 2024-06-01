package ArrayProg;

import java.util.Scanner;

public class index {
	//3 4 -7 1 3 3 1 -4
	 public static void SubArray(int ...x)
	 {
		  int sum = 0,count=0,k=-1;
		    for (int  i=0; i < x.length; i++) {
		    	  sum+=x[i];
		    	  if(7!=sum)
		    	  {
		    		  System.out.print(x[i]+"\t");
		    	  }
			}
		    System.out.println();
	 }
	
  public static void main(String[] args) {
      int a[] = new int[8];
      Scanner sc = new Scanner(System.in);
       for (int i = 0; i < a.length; i++) {
		 a[i]=sc.nextInt();
	}
        
      for (int i = 0; i < a.length; i++) {
    	  SubArray(a);
	}
}
}
