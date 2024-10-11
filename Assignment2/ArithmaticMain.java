package Assignment2;
import java.util.*;
class Arithmatic{
	void add(int a,int b)
	{
		System.out.println("Sum ="+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Sum of 3 integers ="+(a+b+c));
	}
	
	void add(float a,int b,int c)
	{
		System.out.println("Sum of 1 float and 2 integers ="+(a+b+c));
	}
	
	public void main()
	{
		System.out.println("Inside Main Oonly");
	}
}
public class ArithmaticMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 nos:-");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		Arithmatic ao= new Arithmatic();
		ao.add(a, b);
		ao.add(a, b, c);
		
		ao.add(9.3f, b, c);
	}

}
