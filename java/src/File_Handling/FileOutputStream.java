package File_Handling;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class FileOutputStream {

	public static void main(String[] args)throws IOException {
		FileOutputStream fout = new FileOutputStream("D:\\sep2023\\abc.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data in file");
		String data=sc.nextLine();
		byte b[] = data.getBytes();
		fout.write(b);
		fout.clone();
		System.out.println("Data Save success..........");	
	}
}