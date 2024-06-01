package Exception_handling;

class VoterException extends ArithmeticException
{
	public String errorMessage()
	{
		return "You are not eligible for voting";
			
	}
}
class VoterRegistration
{
	void AcceptVoterDetail(String name, int age)
	{
		if(age<18)
		{
			VoterException ve = new VoterException();
			throw ve;
		}
		else
		{
			System.out.println("Voter name and age: "+name+"\t"+age);
		}
	}
}
public class User_definedEH {

	public static void main(String[] args) {
		
		try
		{
			VoterRegistration vr = new VoterRegistration();
			vr.AcceptVoterDetail("RAM", 19);
	
		}
		catch(VoterException ve)
		{
			System.out.println("error is "+ve.errorMessage());
		}
	}

}
