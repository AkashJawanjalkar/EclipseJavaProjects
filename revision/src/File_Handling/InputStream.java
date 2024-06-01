package File_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("D:\\\\sep2023\\\\profile\\\\demo123");
		int data;
		while((data=fin.read())!=-1)
		{
			System.out.println((char)data);
		}
	}

}
