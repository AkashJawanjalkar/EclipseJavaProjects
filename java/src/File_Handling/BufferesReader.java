package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferesReader {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("D:\\sep2023\\profile\\demo123");
		
		BufferedReader br = new BufferedReader(fr);
		String LineData;
		//int data;
//		while((data=fr.read())!=1)
//		{
//			char ch = (char)data;
//			System.out.println(ch);
//			Thread.sleep(100);
//		}
		
		while((LineData=br.readLine())!=null)
		{
			System.out.println(LineData);
			Thread.sleep(1000);
		}
	}

}
