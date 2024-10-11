package Abstraction;
import java.util.*;
public class AccountMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		  SavingsAccount a1=new SavingsAccount(); 
		   
		  a1.setId(101); 
		  a1.setName("ABC"); 
		  a1.setBal(25000); 
		  System.out.println("Enter the Amount you want to withdraw:"); 
		  double amt=sc.nextDouble(); 
		  a1.withdraw(amt); 
		   
		  System.out.println("Details are as follows:"); 
		  System.out.println(a1); 
		   
		   
		  System.out.println("Enter the Amount you want to Deposite:"); 
		  double damt=sc.nextDouble(); 
		  a1.deposite(damt); 
		   
		  System.out.println("Details are as follows"); 
		  System.out.println(a1); 
		   
		  a1.showdata(); 
	}

}
