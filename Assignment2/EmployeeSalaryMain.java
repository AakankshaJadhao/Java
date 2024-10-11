package Assignment2;
import java.util.*;
class Employees{
	int id;
	String name;
	Double salary;
	
	void acceptemp()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp_id,Name:");
		id=sc.nextInt();
		name=sc.next();		
	}
}
class PartTimeEmployee extends Employees{
	double no_hr,charges;
	void calculateSalary()
	{
		acceptemp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of hour the employee worked and charges:");
		no_hr=sc.nextDouble();
		charges=sc.nextDouble();
		salary=charges*no_hr;
				
	}
	void display()
	{
		System.out.println("Details are as follow:");
		System.out.println("Emp_Id="+id+"Name="+name+"Total_salary="+salary);

	}
	
}
class FullTimeEmployee extends Employees{
	int hra,pf,tds,sal;
	void calculateSalary()
	{
		acceptemp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary,Hra,Pf,tds:");
		sal=sc.nextInt();
		hra=sc.nextInt();		
		pf=sc.nextInt();
		tds=sc.nextInt();
		
		salary=(double) ((sal-pf-tds)+(hra));
		
	}
	void display()
	{
		System.out.println("Details are as follow:");
		System.out.println("Emp_Id="+id+"Name="+name+"Total_salary="+salary);

	}
}
public class EmployeeSalaryMain {

	public static void main(String[] args) {
		PartTimeEmployee  pt=new PartTimeEmployee();
		pt.calculateSalary();
		pt.display();
		
		FullTimeEmployee ft=new FullTimeEmployee();
		ft.calculateSalary();
		ft.display();

	}

}
