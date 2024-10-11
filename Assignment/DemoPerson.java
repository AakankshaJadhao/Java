package Assignment;

public class DemoPerson {
	String name;
	int age;
	
	public DemoPerson(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void displayPersonDetails()
	{
		System.out.println("Name="+name+"\tAge="+age);
	}
}
