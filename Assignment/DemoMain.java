package Assignment;

public class DemoMain {

	public static void main(String[] args) {
		DemoPerson person=new DemoPerson("raj",60);
		person.displayPersonDetails();
		
		DemoEmployee employee=new DemoEmployee("Rani",40,"12zc");
		employee.displayEmployeeDetails();
		
		DemoPerson p1=(DemoPerson)new DemoEmployee("Kavya", 24, "A207");;
		p1.displayPersonDetails();
		
		DemoEmployee p2=(DemoEmployee) new DemoPerson("Anuja",32);
		p2.displayPersonDetails();
	}

}
