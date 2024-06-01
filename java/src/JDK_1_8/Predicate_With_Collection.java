package JDK_1_8;

import java.util.ArrayList;
import java.util.function.Predicate;

class User
{
	private String name;
	private String role;
	public User(String name, String role)
	{
		this.name=name;
		this.role=role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
public class Predicate_With_Collection {

	public static void main(String[] args) 
	{
		ArrayList<User> al = new ArrayList<User>();
				al.add(new User("ram","user"));
				al.add(new User("Shyam","user"));
				al.add(new User("Ganesh","Admin"));
				al.add(new User("Dinesh","user"));
				al.add(new User("Sandeep","user"));
					
				al.forEach((User user)->{
				if(((Predicate<String>)(String t)->t.equals("Admin")).test(user.getRole())) 
					{
					System.out.println(user.getName()+"\t"+user.getRole());
					}
				});			
	}
}