package Abstraction;

public class SavingsAccount implements Accounts  {

	int id; 
    String name; 
    double bal; 
    public int getId() { 
    	return id; 
    } 
    public void setId(int id) { 
    	this.id = id; 
    } 
    public String getName() { 
    	return name; 
    } 
    public void setName(String name) { 
    	this.name = name; 
    } 
    public double getBal() { 
    	return bal; 
    } 
    public void setBal(double bal) { 
    	this.bal = bal; 
    } 
	@Override
	public void withdraw(double amt) {
		System.out.println("Your minimum balance must be Rs.5000"); 
		  if((bal>=5000) &&(amt>0) && (amt<bal)) 
		  { 
		   bal=bal-amt; 
		   System.out.println("Withdraw Success !!"); 
		   System.out.println("Your Current balance="+bal); 
		    
		  } 
		  else  
		   System.out.println("Insufficient Balance!!"); 
	}

	@Override
	public void deposite(double amt) {
		if(amt>0) 
		  { 
		   bal=bal+amt; 
		   System.out.println("Deposite Success!!"); 
		   System.out.println("Your current balance="+bal); 
		  } 
	}
	@Override
	public String toString() {
		return "SavingsAccount [id=" + id + ", name=" + name + ", bal=" + bal + "]";
	}

}
