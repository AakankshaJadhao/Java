package Abstraction;
import java.util.*;
public class Circles extends Shapes {
	 
	 @Override
	 void area()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter radius");
		 double r=sc.nextDouble();
		 System.out.println("Area of circle="+(3.14*r*r));
	 }
	 
}
