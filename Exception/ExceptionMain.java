package Exception;
import java.util.*;
class Exception_a{
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ener 2 no.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		if(b==0)
			throw new ArithmeticException("Divide by zero not allowed");
		else
		{
			System.out.println("Sum=" +(a+b));			
			System.out.println("Divide="+(a/b));
			System.out.println("Sub=" +(a-b));
			System.out.println("Product=" +(a*b));			
			
		}

	}
}
public class ExceptionMain {

	public static void main(String[] args) {
		Exception_a e=new Exception_a();
		e.accept();
	}

}
