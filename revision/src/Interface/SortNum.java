package Interface;

import java.util.*;
interface ArraySort{
	void sortAscending();
	void sortDescending();
}
class NumberSort implements ArraySort{
	private int arr[];
	public void setArray(int arr[]) {
		this.arr=arr;
	}
	public int sortAsc(int no) {
		
		int ele[]=new int[4];
		int k=0;
		while(no>0) {
			int rem=no%10;
			ele[k++]=rem;			
			no/=10;
		}
		for (int i = 0; i < ele.length; i++)   {  
			for (int j = i + 1; j < ele.length; j++)   { 
				int tmp=0;
				if (ele[i] > ele[j]){  
					tmp = ele[i];  
					ele[i] = ele[j];  
					ele[j] = tmp;  
				}  
			}
		}
		int sum=0;
		for(int i=0;i<ele.length;i++) {
			sum=sum*10+ele[i];
		}
		return sum;
	}
	public void sortAscending() {
		int no1[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			no1[i]=sortAsc(arr[i]);
		}
		
		System.out.printf("\nArray Elements are after sorting in Ascending:");
		for(int i:no1) {
			System.out.printf(" %d", i);
		}
	}
	public int sortDsc(int no) {
			
			int ele[]=new int[4];
			int k=0;
			while(no>0) {
				int rem=no%10;
				ele[k++]=rem;			
				no/=10;
			}
			for (int i = 0; i < ele.length; i++)   {  
				for (int j = i + 1; j < ele.length; j++)   { 
					int tmp=0;
					if (ele[i] < ele[j]){  
						tmp = ele[i];  
						ele[i] = ele[j];  
						ele[j] = tmp;  
					}  
				}
			}
			
			int sum=0;
			for(int i=0;i<ele.length;i++) {
				sum=sum*10+ele[i];
			}
			return sum;
		}
	public void sortDescending() {
		int no1[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			no1[i]=sortDsc(arr[i]);
		}
		
		System.out.printf("\nArray Elements are after sorting in Descending :");
		for(int i:no1) {
			System.out.printf(" %d", i);
		}
	}
}
class CharSort implements ArraySort{
	private char arr[];
	public void setArray(char arr[]) {
		this.arr=arr;
	}
	public void sortAscending() {
		for(int j=0;j<arr.length;j++) {
			for(int i=j+1;i<arr.length;i++) {
				if(arr[i]<arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void sortDescending() {
		for(int j=0;j<arr.length;j++) {
			for(int i=j+1;i<arr.length;i++) {
				if(arr[i]>arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public void display() {
		System.out.printf("\nArray Elements are after sorting:");
		for(int i:arr) {
			System.out.printf(" %c", i);
		}
	}
}
public class SortNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		
		int arr[]=new int[6],ch;
		String name;
		do {
			System.out.println("\nWhat do you want to do:\n1. Number Sorting \n2. Charcter Sorting\n3.Exit");
			ch=sc.nextInt();
			switch(ch) {
				case 1->{
				NumberSort i=new NumberSort();
				System.out.println("Enter numbers to sort:");
				for(int k=0;k<arr.length;k++) 
					arr[k]=sc.nextInt();
				i.setArray(arr);
				i.sortAscending();
				i.setArray(arr);
				i.sortDescending();
				}
				case 2->{
				sc.nextLine();
				System.out.println("Enter Charcter string to sort:");
				name=sc.nextLine();
				CharSort c=new CharSort();
				c.setArray(name.toCharArray());
				c.sortAscending();
				c.display();
				c.sortDescending();
				c.display();
				}
				case 3->{
					System.out.println("Exiting code....");
				}
				default->{
					System.out.println("you enter wrong choice.");
				}
			}
		}while(ch!=3);
		}
	}