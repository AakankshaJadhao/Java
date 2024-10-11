/*Write a Java program to create a class Car with the following 
attributes: model, year, and price. Include a method displayDetails() that prints the car details.
Create two objects of the class Car and display their details.*/
package Assignment;

public class Car {
	int model;
	double year;
	Double price;
	
	public void displayDetails(int model, double year,double price) {
		this.model=model;
		this.year=year;
		this.price=price;
		
		System.out.println("Car detail are as follow:");
		System.out.println("Model="+model+"\tYear="+year+"\tPrice="+price);
		}
}
