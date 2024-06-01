package File_Handling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer_InputString_StoreINFIle {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:\\sep2023\\profile\\demo.doc",true);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter data in file\n");
		String data=sc.nextLine();
		fw.write(data);
		fw.close();
		System.out.println("File data save successfully....");
		
	}

}
