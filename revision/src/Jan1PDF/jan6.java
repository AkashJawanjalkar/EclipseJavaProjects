package Jan1PDF;

import java.util.Scanner;

class ConUpper
{
	char[] name=new char[90];
	void setCA(char ch[])
	{
		this.name=ch;
	}
	void ConvertTOUpper()
	{
		for(int i=0;i<name.length;i++)
		{
			if(name[i]>='a' && name[i]<='z')
			{
				name[i]=(char) (name[i]-32);
			}
			
		}
		System.out.println(name);
}
}
public class jan6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter any name:");
		name = sc.nextLine();
		char ch[] = name.toCharArray();
		ConUpper c = new ConUpper();
		c.setCA(ch);
		c.ConvertTOUpper();
	}

}
