/*Create a class Calculator with two overloaded methods
 add(). One method should take two integer parameters,
 and the other should take three integer parameters. 
 Demonstrate how both methods can be used to add numbers.
*/
package Assignment;
public class Calculator {
	int n1,n2,n3;
	
	void add(int n1,int n2,int n3)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;		
		System.out.println("Addition of numbers="+(n1+n2+n3));
	}
	void add(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;		
		System.out.println("Addition of numbers="+(n1+n2));
	}
}
