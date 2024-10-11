/*design a class VEHICLE with data members vid vname and price,design another class CAR which will inherit members
and have data member speed accept from user and display details for the same take another clas bike with member distance 
and time and calculate speed for the bike and print details for thr same*/

package Assignment2;
class Vehical{
	int vid;
	String vname,design;
	Double price;
	
	Vehical(int vid,String vname,String design,double price)
	{
		this.vid=vid;
		this.vname=vname;
		this.design=design;
		this.price=price;
		
	}
	
}
class Cars_v extends Vehical{
	double speed;
	
	Cars_v(int vid,String vname,String design,double price,double speed)
	{
		super(vid,vname,design,price);
		this.speed=speed;
	}
	
	void carDisplay()
	{
		System.out.println("Car Details");

		System.out.println("Id="+vid+"\tName="+vname+"\tDesign="+design+"\nprice="+price+"\tSpeed="+speed);
	}
}
class Bike extends Vehical{
	int distance,time;
	
	
	Bike(int vid,String vname,String design,double price,int distance ,int time)
	{
		super(vid,vname,design,price);
		this.distance=distance;
		this.time=time;
	}
	void bikeDisplay()
	{
		System.out.println("Bike Details");
		System.out.println("Id="+vid+"\tName="+vname+"\tDesign="+design+"\tprice="+price);
		System.out.println("Speed of bike="+(distance/time));

	}
}
public class VehicalMain {

	public static void main(String[] args) {
		Cars_v c=new Cars_v(101,"Maruti sukuki","new",35000.0,45.6);
		c.carDisplay();
		
		Bike b=new Bike(102,"Nova","new",45000.0,450,2);
		b.bikeDisplay();
	}

}
