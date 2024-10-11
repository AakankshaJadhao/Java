package Abstraction;

public class Singletons {
	private static Singletons obj;
	
	private Singletons()
	{
		System.out.println("Inside Singleton Constructor");
	}
	
	static Singletons getInstance()
	{
		if(obj==null)
		{
			obj=new Singletons();
			System.out.println("1st Object is created.");
			
		}
		else
			System.out.println("no Object is created.");
		return obj;			
	}
	
}
