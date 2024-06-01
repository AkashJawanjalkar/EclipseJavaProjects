package File_Handling;

import java.io.*;
import java.util.*;

public class BuffereedWriter_class {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\sep2023\\profile\\demo123",true);
		
		BufferedWriter bw = new BufferedWriter(fw);
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter data in file:");
		String data = sc.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("File data save successfuly......");
	}
}