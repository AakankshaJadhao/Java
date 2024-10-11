package Inheritance;

public class AgregateMain {

	public static void main(String[] args) {
		Address a1=new Address("Pune","MH","India");
		Address a2=new Address("Banglore","Karnataka","India");
		
		Student2 s1=new Student2(101,"Riya",89,a1);
		Student2 s2=new Student2(102,"Raj",95,a2);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(s1);
		System.out.println(s2);


	}

}
/*
Create a class Employee with[id,name,salary]create another class
 department[id,name]department must perform agregation with employee
*/