package Assignment;

public class CityEmployee {
	String name;
	double salary;
	CityAddress address;
	
	public CityEmployee(String name,double salary,CityAddress address)
	{
		
		this.name=name;
		this.salary=salary;
		this.address=address;
	}
	void displayDetails()
	{
		System.out.println("Name="+name+"\tSalary="+salary);
		System.out.println(address.city+" "+address.state+" "+address.zipCode);
	}
}
