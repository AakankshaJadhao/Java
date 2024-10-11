/* Create two classes: Address with attributes
  city, state, and zipCode, and Employee with attributes 
  name, salary, and an Address object as its attribute.
   Demonstrate how to create an Employee object with 
   an Address object (aggregation relationship).
 */
package Assignment2;
class Address{
	String city,state,zipCode;
	
	Address(String city,String state,String zipCode)
	{
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
	}
}
class Employee_add{
	String name;
	Double sal;
	Address address;
	
	Employee_add(String name,Double sal,Address address)
	{
		this.name=name;
		this.sal=sal;
		this.address=address;
	}
	void display()
	{
		System.out.println("Name="+name+"\tSalary="+sal);
		System.out.println(address.city+" "+address.state+" "+address.zipCode);
	}
}
public class EmployeeAddressMain {

	public static void main(String[] args) {
		Address a1=new Address("Saoner","Maharashtra","441107");
		Employee_add e1=new Employee_add("Raja",4500.0,a1);
		e1.display();
	}

}
