package ArrayProg;

import java.util.Scanner;

public class CeilingFloor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
	
		System.out.println("Enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("the evry element of array's celling and floor is");
		for (int i = 0; i < a.length; i++) {
            int num = a[i];
            int c = -1, f = -1;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == num) {
                    c = num;
                    f = num;
                    break;
                } else if (a[j] < num) {
                    f = a[j];
                } else if (a[j] > num) {
                    c = a[j];
                    break;
                }
            }

            System.out.println("For element " + num + ":");
            System.out.println("Floor is " + f);
            System.out.println("Ceiling is " + c);
        }
    }
}
