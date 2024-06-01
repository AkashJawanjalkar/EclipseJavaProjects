package ScannerClass;
import java.util.*; 
public class StringOccuranceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner xyz=new Scanner(System.in);
    // char ch[]=new char[5];
      int i,j;
      System.out.println("Enter the string");
      String str=xyz.next();
       char ch1[]=str.toCharArray();
      for(i=0;i<ch1.length;i++)
      {
    	 for(j=i+1;j<ch1.length;j++)
    	 {
    		 if(ch1[i]>ch1[j])
    		 {
    			 char temp=ch1[i];
    			      ch1[i]=ch1[j];
    			      ch1[j]=temp;
    		 }
    	 }
      }
      System.out.println("Display after sort");
      for(i=0;i<ch1.length;i++)
      {
    	  System.out.printf("%c\n",ch1[i]);
      }
      int count=1;
     for(i=0;i<ch1.length;i++)
     {
    	 if(i==ch1.length-1)
    	 {
    		 System.out.printf("%c%d",ch1[i],count);
    		 break;
    	 }
    	 if(ch1[i]==ch1[i+1])
    	 {
    		 count++;
    	 }
    	 else
    	 {
    		 System.out.printf("%c%d",ch1[i],count);
    		 count=1;
    	 }
     }
	}

}
