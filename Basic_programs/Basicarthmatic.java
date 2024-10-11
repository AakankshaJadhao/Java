/*Write a Program to take two numbers from user and perform basic operations addition, subtraction,division and remainder.*/
package Basic_programs;
import java.util.*;
public class Basicarthmatic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers a and b");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Sum="+(a+b));
		System.out.println("Sub="+(a-b));
		System.out.println("Mul="+(a*b));
		System.out.println("Div="+(a/b));
		System.out.println("Rem="+(a%b));		
	}
}
