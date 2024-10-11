package Assignment2;

import Assignment.Employee;

class StaticEmployee{
	static String companyName="EduTech";
	String name;
	double salary;
	
	StaticEmployee(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	void displayEmployeeDetails()
	{
		System.out.println("Employee Name="+name+"\tEmployee salary="+salary+"\tCompany Name="+companyName);
	}
}
public class StaticEmployeeMain {

	public static void main(String[] args) {
		StaticEmployee emp1 = new StaticEmployee("Raj", 50000);
		StaticEmployee emp2 = new StaticEmployee("Riya", 60000);
		StaticEmployee emp3 = new StaticEmployee("Arjit", 55000);

        // Displaying details of each employee
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

	}

}
