package Assignment;
public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Raj", 50000);
        Employee emp2 = new Employee("Riya", 60000);
        Employee emp3 = new Employee("Arjit", 55000);

        // Displaying details of each employee
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();
	}

}
