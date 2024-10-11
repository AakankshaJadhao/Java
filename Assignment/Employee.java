package Assignment;

public class Employee {
	static String companyName="EduTech";
	String name;
	double salary;
	
	Employee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void displayEmployeeDetails()
	{
		System.out.println("Employee Name="+name+"\tEmployee salary="+salary+"\tCompany Name="+companyName);
	}
}
