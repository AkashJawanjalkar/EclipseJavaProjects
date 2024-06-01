package File_Handling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		File f = new File("D:\\sep2023\\profile");
		//boolean b =f.mkdir();
		//boolean b = f.exists();
		//boolean b = f.isFile();
		boolean b = f.isDirectory();
		if(b)
		{
			System.out.println("Folder creted Successfully(exists)....");
		}
		else
		{
			System.out.println("Some problem is there(no exists)..");
		}
	}
}