package Assignment2;
class DemoPerson{
	String name;
	int age;
	
	DemoPerson(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displayPerson()
	{
		System.out.println("Name="+name+"\tAge="+age);
	}
	
}
class DemoEmployee extends DemoPerson{
	String empid;
	DemoEmployee(String name,int age,String empid)
	{
		super(name,age);
		this.empid=empid;
	}
	void displayEmployee()
	{
		System.out.println("Name="+name+"\tAge="+age+"\tEmpId="+empid);
	}
}
public class DemoMain {

	public static void main(String[] args) {
		DemoPerson dp=new DemoPerson("raja",22);
		dp.displayPerson();
		
		DemoEmployee de=new DemoEmployee("Kaju",52 , "101");
		de.displayEmployee();
	}

}
