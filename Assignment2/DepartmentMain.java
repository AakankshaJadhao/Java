package Assignment2;
import java.util.*;
class Department{
	int id,no_emp;
	String name;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept_id,Dept_name,No_Of_Employee_Dept");
		id=sc.nextInt();
		name=sc.next();
		no_emp=sc.nextInt();
	}
	
	void display()
	{
		System.out.println("Id="+id+"\tName="+name+"\tNo_Emp="+no_emp);
	}
		
}
public class DepartmentMain {

	public static void main(String[] args) {
		Department d=new Department();
		d.accept();
		d.display();
	}

}
