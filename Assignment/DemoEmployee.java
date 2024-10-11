package Assignment;

public class DemoEmployee extends DemoPerson {
	String employeeId;
	public DemoEmployee(String name,int age,String employeeId)
	{
		super(name,age);
		this.employeeId=employeeId;
		
	}
	public void displayEmployeeDetails() {
		super.displayPersonDetails();
		System.out.println("Employee ID: " + employeeId);
		
	}
}
