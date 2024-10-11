package Abstraction;
import java.util.*;
public class AccountMain1 {

	public static void main(String[] args) {
		int ch; 
		  double amt ,dmt; 
		  Scanner sc=new Scanner(System.in); 
		  SavingAccount ob=new SavingAccount(); 
		   
		  ob.setId(101); 
		  ob.setName("ABC"); 
		  ob.setBal(23000); 
		   
		  System.out.println("Enter The Choice:\n1).Deposit\t2).Check Balance\t3).Withdraw\t4).Default"); 
		  ch=sc.nextInt(); 
		  switch(ch) 
		   { 
		   
		   case 1: 
		     System.out.println("Enter the amount to be deposited:-"); 
		     dmt=sc.nextDouble(); 
		     ob.deposite(dmt);          //calling method 
		     System.out.println(ob);         //printing remaining details 
		     break; 
		      
		   case 2: 
		     System.out.println("Balance:-"); 
		     System.out.println(ob);         //printing remaining details   
		     break; 
		      
		   case 3: 
		     System.out.println("Enter the amount to be withdrawl:-"); 
		     amt=sc.nextDouble(); 
		     ob.withdraw(amt); 
		     break; 
		    
		 
		   default: 
		     System.out.println("Thank You Visit Again!!"); 
		     break; 
		   } 
	}

}
