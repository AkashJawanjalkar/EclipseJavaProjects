package File_Handling;

import java.io.File;

public class getList {

	public static void main(String[] args) {
		File f = new File("D:\\");
		File list[] = f.listFiles();
		
		for(int i=0;i<list.length;i++)
		{
			if(list[i].isDirectory())
			System.out.println(list[i]);
		}
	}

}
