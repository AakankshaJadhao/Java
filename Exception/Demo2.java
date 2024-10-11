package Exception;

import java.util.Scanner;

class Arith{
	
	Scanner sc=new Scanner(System.in);
	void accept() {
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//for ArithmeticException
		try
		{
			System.out.println("Sum=" +(a+b));			
			System.out.println("Divide="+(a/b));
			System.out.println("Sub=" +(a-b));
			System.out.println("Product=" +(a*b));			
			
		}		
     	catch(ArithmeticException ex){
			System.out.println(ex.getMessage());

		}
		
		//for NullPointerException
		try {
			String s=null;
			System.out.println("String length"+s.length());
		}
		catch(NullPointerException ex){
			System.out.println(ex.getMessage());

		}
		
		//for ArrayIndexOutOfBoundsException
		try {
			int arr[]=new int[4];
			System.out.println(arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());

		}
		
		finally {
			System.out.println("Inside finally block");
			
		}
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		Arith a=new Arith();
		a.accept();
	}

}
