package Constructor;

class Salary
{
	String name,contact;
	int id,preDay,prDaySal,sal;
	Salary(String name,int id,String contact,int preDay,int prDaySal)
	{
		this.name=name;
		this.id=id;
		this.contact=contact;
		this.preDay=preDay;
		this.prDaySal=prDaySal;
	}
	void CalSal()
	{
		sal=preDay*prDaySal;
	}
	void Show()
	{
		System.out.println("name\tid\tcontact\tpresent Day\tper Day Salary");
		System.out.println(name+"\t"+id+"\t"+contact+"\t"+preDay+"\t"+prDaySal+"\t"+sal);
	}
}
public class SalaryApp {

	public static void main(String[] args) {
		Salary s = new Salary("Aniket",302,"4141",18,2000);
		s.CalSal();
		s.Show();
	}

}
