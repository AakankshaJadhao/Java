package Assignment2;
class Cars{
	String model;
	int year;
	double price;
	
	Cars()
	{
		model="y2306";
		year=2022;
		price=45000;
	}
	
	Cars(String model,int year,double price)
	{
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	Cars(String m,double p,int y )
	{
		model=m;
		year=y;
		price=p;
	}
	
	void displayDetails()
	{
		System.out.println("Model="+model+"\tYear="+year+"\tPrice="+price);
	}
}
public class CarsMain {

	public static void main(String[] args) {
		Cars c1=new Cars();
		c1.displayDetails();
		
		Cars c2=new Cars("Z2441",2021,34500.0);
		c2.displayDetails();
		
		Cars c3=new Cars("G4512",4500.7,2009);
		c3.displayDetails();
	}

}
