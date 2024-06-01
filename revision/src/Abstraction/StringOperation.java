package Abstraction;
import java.util.*;
abstract class StringpOp
{
	abstract void performOp(String x);
}
class convertToUpper extends StringpOp
{
	void performOp(String x) {
		char a[] = x.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a' && a[i]<='z' )
			{
				a[i] = (char) (a[i]-32);
			}
		}
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
		}
	}
}
class maxrepeated extends StringpOp
{
	void performOp(String x)
	{
		int count,maxcount=0;
		char maxchar = 0;
		char a[] = x.toCharArray();
		for(int i=0;i<a.length;i++)
		{   
			count=0;
			for(int j=0;j<a.length;j++)
			{  
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				maxchar=a[i];
			}
		}
		System.out.println("\n");
		System.out.print(maxchar+" "+maxcount+" Times");
	}
}
class wordReverse extends StringpOp
{
	void performOp(String x) 
	{
		char a[] = x.toCharArray();
		int mid = a.length/2;
		int end = a.length-1;
		
		for(int i=0; i<mid; i++)
		{
			char t = a[i];
			a[i] = a[end];
			a[end] = t;
			end--;
		}
		System.out.println("\n");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}
public abstract class StringOperation 
{

	public static void main(String[] args) 
	{
		convertToUpper c = new convertToUpper();
		c.performOp("jaysriram");
		
		maxrepeated m = new maxrepeated();
		m.performOp("good boy");
		
		wordReverse w = new wordReverse();
		w.performOp("marirsyaj");
	}
}