package Abstraction;

public interface Accounts 
{
	void withdraw(double amt); 
	 void deposite(double amt); 
	  
	 default void showdata()  
	 { 
	  System.out.println("we are planning to add more functionality"); 
	   
	 } 
	
}
