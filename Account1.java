package Abstraction;

public abstract class Account1 {
	abstract void withdraw(double amt); 
	 abstract void deposite(double amt); 
	  
	 static void msg() 
	 { 
	  System.out.println("We want to add even more functionality"); 
	 } 
	  
//	 default void print() 
//	 { 
//	  System.out.println("We want to add even more functionality in default block too!!"); 
//	 }
}