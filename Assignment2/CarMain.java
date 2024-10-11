package Assignment2;
class Car{
	String model;
	int year;
	double price;
	
	Car(String model,int year,double price)
	{
		this.model=model;
		this.year=year;
		this.price=price;
	}
	
	public void displayDetails()
	{
		System.out.println("Model="+model+"\tYear="+year+"\tPrice="+price);
	}
}


public class CarMain {
	public static void main(String args[])
	{
		Car c1 = new Car("Nano",2016,240000);
		Car c2 = new Car("Maruti",2022,350000);
		
		c1.displayDetails();
		c2.displayDetails();

	}
}
