package Assignment2;
class Parent{
	void show()
	{
		System.out.println("Inside parent class");
	}
}
class Child extends Parent{
	void show()
	{
		System.out.println("Inside child class");

	}
}
public class UpcastingDownCastingMain {

	public static void main(String[] args) {
		Parent p=(Parent)new Child();
		p.show();
		
		Child c=(Child)p;
		c.show();
		
	}

}
