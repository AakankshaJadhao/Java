package Assignment2;
class Calculator 
{
	void add(int a,int b)
	{
		System.out.println("Sum of 2 integers="+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Sum of 3 integers="+(a+b+c));
	}
	
}
public class CalculatorMain {

	public static void main(String[] args) {
		Calculator c1=new Calculator();
		c1.add(5, 10);
		Calculator c2=new Calculator();
		c2.add(10, 15,20);

	}

}
