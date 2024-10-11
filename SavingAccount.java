package Abstraction;

public class SavingAccount implements Accounts {
	int id; 
	 String name; 
	 double bal; 
	  
	 public int getId() { 
	  return id; 
	 } 
	 
	 public String getName() { 
	  return name; 
	 } 
	 
	 public double getBal() { 
	  return bal; 
	 } 
	 
	 public void setId(int id) { 
	  this.id = id; 
	 } 
	 
	 public void setName(String name) { 
	  this.name = name; 
	 } 
	 
	 public void setBal(double bal) { 
	  this.bal = bal; 
	 } 
	//----------------------------------------------------//---------------------------------------------------- 
	 @Override 
	 public void withdraw(double amt)  
	 { 
	  System.out.println("Minimum balance should be above Rs.5k"); 
	   
	  if((bal>5000) && (amt>0) && (amt<bal)) 
	  { 
	   bal=bal-amt; 
	   if(bal>=5000) 
	   { 
	    System.out.println("Withrawn Successfully !! "); 
	    System.out.println("Your current balance="+bal); 
	   } 
	   else 
	   { 
	    System.out.println("Not Enough Balance"); 
	   }    
	  } 
	  else 
	  { 
	   System.out.println("Insuffecient Balance"); 
	  } 
	    
	 } 
	 
	 @Override 
	 public void deposite(double amt)  
	 { 
	  if((amt>0) && (amt<=10000)) 
	  {  
	   bal=bal+amt; 
	   System.out.println("Deposited Succesfully="+bal); 
	  }  
	  else 
	  { 
	   System.out.println("Deposit amount limit exceeded"); 
	  }  
	 } 
	//---------------------------------------------------------------------------------- 
	 @Override 
	 public String toString()  
	 { 
	  return "SavingAccount [id=" + id + ", name=" + name + ", bal=" + bal + "]"; 
	 } 
	 
	  
}
