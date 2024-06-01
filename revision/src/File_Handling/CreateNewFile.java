package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\sep2023\\profile\\resumeRb.doc");
		
		boolean b = f.createNewFile();
		if(b)
		{
			System.out.println("File created successfully....");
		}
		else
		{
			System.out.println("Some problem is there....");
		}
	}

}
