package Assignment;

public class AddEmpMain {

	public static void main(String[] args) {
		CityAddress add1=new CityAddress("Nagpur","Maharashtra","441107");
		CityEmployee emp1=new CityEmployee("Niraj",75000,add1);
		emp1.displayDetails();
	}

}
/*
 Create two classes: Address with attributes
  city, state, and zipCode, and Employee with attributes 
  name, salary, and an Address object as its attribute.
   Demonstrate how to create an Employee object with 
   an Address object (aggregation relationship).
 */
 