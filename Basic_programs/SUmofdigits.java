/*.Write a program to find the sum of digits of a number.*/
package Basic_programs;
import java.util.*;
public class SUmofdigits {

	public static void main(String[] args) {
		int sum=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number.");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			rem=n%10;
			n=n/10;		
			sum=sum+rem;
		}
		System.out.println("Sum of digits="+sum);
	}
}
