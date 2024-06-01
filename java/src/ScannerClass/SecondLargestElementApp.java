package ScannerClass;
import java.util.*;
public class SecondLargestElementApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner xyz=new Scanner(System.in);
    int a[]=new int[5],i;
    int first=a[0];
    int second=a[0];
    System.out.println("Enter the Array values");
    for(i=0;i<a.length;i++)
    {
    	a[i]=xyz.nextInt();
    }
    for(i=0;i<a.length;i++)
    {
    	  if(first<a[i])
    	  {
    		   second=first;
    		   first=a[i];
    	  }
    	  else if(a[i]>second && a[i]!=first)
    	  {
    		    second=a[i];
    	  }
    }
    if(second==first)
    {
    	System.out.println("There is no second largest element present in array");
    }
    else
    {
    	System.out.printf("Second largest:%d",second);
    }
	}

}
