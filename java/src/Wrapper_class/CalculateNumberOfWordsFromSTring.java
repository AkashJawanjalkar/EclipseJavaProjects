package Wrapper_class;

public class CalculateNumberOfWordsFromSTring {

	public static void main(String[] args) {
		String s = "good morning india india is my country";
		
		String words[]=s.split(" ");
		System.out.println("Display all string data:");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}

}
