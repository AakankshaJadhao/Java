package Assignment2;
class Animal{
	void show()
	{
		System.out.println("Animal make sound");
	}	
}
class Cat {
	void show()
	{
		System.out.println("Cat meowww");
	}
}
public class AnimalMain {

	public static void main(String[] args) {
		Animal a1=new Animal();
		a1.show();
		
		Cat c=new Cat();
		c.show();
	}

}
