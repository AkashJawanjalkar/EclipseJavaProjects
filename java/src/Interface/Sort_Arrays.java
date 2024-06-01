package Interface;

import java.util.Scanner;

interface ArraySorting
{
	void sortAscending(int arr[]);
	void sortDescending(int arr[]);
	void sumOfDigit(int arr[]);
	void evenAtFirst(int arr[]);
	void checkPrime(int arr[]);
}
class Operation
{
	protected int[] numberToDigit(int no)
	{
		int count = Count(no);
		int arr[]=new int[count],i=0;
		while(no>0)
		{
			int rem=no%10;
			arr[i++]=rem;
			no/=10;
		}
		return arr;
	}
	protected int DigitsToNumbers(int arr[])
	{
		int no=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				continue;
			}
			no=no*10+arr[i];
		}
		return no;
	}
	protected int Count(int no)
	{
		int count=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		return count;
	}
	protected int[] Ascending(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	protected int checkEven(int arr[])
	{
		int result[] = new int [arr.length],i=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2==0)
			{
				result[i++]=arr[j];
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]%2!=0)
			{
				result[i++]=arr[j];
			}
		}
		return DigitsToNumbers(result);
	}
	protected int Prime(int arr[])
	{
		int result[] = new int[arr.length];
		int k=0,i=2,flag=0;
		for(int j=0;j<arr.length;j++)
		{
			flag=0;
			if(arr[j]==1 || arr[j]==0)
			{
				flag=1;
			}
			while(i<=arr[j]/2)
			{
				if(arr[j]%i==0)
				{
					flag=1;
					break;
				}
				i++;
			}
			if(flag==0 && arr[j]>1)
			{
				result[k++]=arr[j];
			}
		}
		return DigitsToNumbers(result);
	}
}
	class Sorting extends Operation implements ArraySorting
	{
		public void sortAscending(int arr[])
		{
			int result[] = new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				result[i]=DigitsToNumbers(Ascending(numberToDigit(arr[i])));
			}
			System.out.println("Array Element after Ascending Sort");
			//display(result);
		}
		public void sortDescending(int arr[])
		{
			int result[] = new int[arr.length];
			for(int i=0;i<arr.length;i++)
			{
				result[i]=DigitsToNumbers(Ascending(numberToDigit(arr[i])));
			}
			System.out.println("Array Elmenet after decensding sort");
			//display(result);
		}
		@Override
		public void sumOfDigit(int[] arr) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void evenAtFirst(int[] arr) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void checkPrime(int[] arr) {
			// TODO Auto-generated method stub		
		}
	}


public class Sort_Arrays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Sorting s=new Sorting();
		int arr[];		
		System.out.println("__________________");
	}
}