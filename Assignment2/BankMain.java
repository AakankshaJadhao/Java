package Assignment2;
import java.util.*;
class Bank{
	int id=101;
	String name="TJSB",add="Fatima Nagar";
	
	public Bank()
	{
		System.out.println("In Default");
	}
	
	public Bank(int id, String name, String add)
	{
		System.out.println("In Parameterized");
		this.id = id;
		this.name = name;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Bank [id="+id+",name="+name+",add="+add+"]";
	}
}
public class BankMain {

	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b);

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id,Name and Address of the Bank= ");
		int bid=sc.nextInt();
		String bname=sc.next();
		String address=sc.next();
		
		Bank b1=new Bank(bid,bname,address);
		System.out.println(b1);
	}

}
