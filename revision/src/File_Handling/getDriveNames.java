package File_Handling;

import java.io.File;

public class getDriveNames {

	public static void main(String[] args) {
		File f[] = File.listRoots();
		for(int i=0;i<f.length;i++)
		{
			
			System.out.println(f[i]);
		}
	}
}
