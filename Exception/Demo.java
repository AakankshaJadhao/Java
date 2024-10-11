package Exception;
import java.util.*;;
class Arithmatic{
	
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
			
		}
		
     	catch(Exception ex){
			System.out.println(ex.getMessage());

		}
		
		finally {
			System.out.println("Inside finally block");
			
		}
	}
	
}
public class Demo {

	public static void main(String[] args) {
		
		Arithmatic a=new Arithmatic();
		a.accept();	

	}

}
