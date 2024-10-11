package Assignment2;
class Employee{
	
	int id;
	String name;
	Double sal;
	
	void accept()
	{
		id=101;
		name="Raja";
		sal=35000.0;
		
	}
	void display()
	{
		System.out.println("Id="+id+"\tName="+name+"\tSalary="+sal);
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.accept();
		e1.display();
	}

}
