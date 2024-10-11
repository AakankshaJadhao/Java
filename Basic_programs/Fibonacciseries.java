/*Write a program to print fibonacci series upto n terms*/
package Basic_programs;
import java.util.*;
public class Fibonacciseries {

	public static void main(String[] args) {
		
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range.");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
