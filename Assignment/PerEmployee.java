package Assignment;

public class PerEmployee extends Person1{
	String employeeId;
	public PerEmployee(String name, int age,String employeeId) {
		super(name, age);
		this.employeeId=employeeId;
		// TODO Auto-generated constructor stub
	}
	
	void displayEmloyeeDetails()
	{
		displayPerson();
		System.out.println("Employee Id:"+employeeId);
	}
}
