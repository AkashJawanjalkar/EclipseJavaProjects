package JDK_1_8;
import java.util.Optional;
import java.util.Scanner;
public class OptionalClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		for(int i=0;i<5;i++)
			str[i]=sc.nextLine();
		for(int i=0;i<str.length;i++) {
			if(Optional.ofNullable(str[i]).isPresent()) {
				System.out.println("Enter STring for checking");
				String scheck = sc.nextLine();
				System.out.println(scheck.equals(Optional.ofNullable(str[i]).get())? "String is present" :" String is not present");
			}
			else
				System.out.println("Create object");
		}	
	}
}