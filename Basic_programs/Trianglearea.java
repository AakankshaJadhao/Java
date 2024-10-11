/*Write a program to calculate the area of triangle. 
 Ask input from user (0.5*base*height)*/
package Basic_programs;
import java.util.*;
public class Trianglearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter base and height");
		float b=sc.nextFloat();
		float h=sc.nextFloat();
		System.out.println("Area="+(0.5*b*h));
	}
}
