package Abstraction;

import java.util.Scanner;

public class Triangle extends Shapes{
	
	 @Override
	 void area()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter base and height");
				 double b=sc.nextDouble();
				 double h=sc.nextDouble();
		 System.out.println("Area of circle="+(0.5*b*h));
	 }
}
