package Assignment2;
class Bank_acc{
	int bid;
	String bname,badd;
	
	Bank_acc(int bid,String bname,String badd){
		this.bid=bid;
		this.bname=bname;
		this.badd=badd;		
	}
}
class Accounts extends Bank_acc{
	int aid;
	String aname;
	Double bal;
	
	Accounts(int bid,String bname,String badd,int aid,String aname,double bal)
	{
		super(bid,bname,badd);
		this.aid=aid;
		this.aname=aname;
		this.bal=bal;
	}
	
	
}
class Customer extends Accounts{
	int cid;
	String cname;
	
	Customer(int bid,String bname,String badd,int aid,String aname,double bal,int cid,String cname)
	{
		super(bid,bname,badd,aid,aname,bal);
		this.cid=cid;
		this.cname=cname;
	}
	
	@Override
	public String toString()
	{
		return "Customer [Customer id="+cid+"Name="+cname+"Account Id="+aid+"Account Name="+aname+"Balance"+bal+"Bank Id="+bid+"Bank Name="+bname+"Bank Address="+badd+"]";
		
	}
	
	
}

public class BankAccMain {

	public static void main(String[] args) {
		Customer a=new Customer(101,"SBI","Pune",506,"Saving",45000.0,907,"Raja");
		System.out.println(a);
	}

}
