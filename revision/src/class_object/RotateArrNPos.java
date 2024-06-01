package class_object;
import java.util.Scanner;
public class RotateArrNPos 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	int a[] = new int[6];
	System.out.println("Enter the elements in array:");
	for(int i=0;i<a.length;i++)
	{
	a[i] = sc.nextInt();
	}
	int b[] = new int[6];
	int pos;    
	System.out.println("Enter position that you want to rotate array:");
	pos = sc.nextInt();
	int k=0;
	for(int i=pos;i<a.length;i++)
	{ 
		b[k]=a[i];
		k++;
	}	
	for(int i=0;i<pos;i++)
	{
		b[k]=a[i];
		k++;
	}
	
	System.out.println("After rotating array from specific position");
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}
	}
}