package Exception;
import java.util.Scanner;
class Arit{
	
	Scanner sc=new Scanner(System.in);
	void accept() {
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
			System.out.println("Sum=" +(a+b));			
			System.out.println("Divide="+(a/b));
			System.out.println("Sub=" +(a-b));
			System.out.println("Product=" +(a*b));
			String s=null;
			System.out.println("String length"+s.length());
			int arr[]=new int[4];
			System.out.println(arr[5]);

		}		
     	catch(ArithmeticException ex){
			System.out.println(ex.getMessage());

		}
		catch(NullPointerException ex){
			System.out.println(ex.getMessage());

		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());

			
			
			
		}
		
		finally {
			System.out.println("Inside finally block");
			//System.exit(0);)
		}
		
	}
	
}
public class MultipleCatch {

	public static void main(String[] args) {
		Arit a=new Arit();
		a.accept();	
	}

}
