/*write program to display reverse number*/
package Basic_programs;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		int rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number.");
		int n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;			
		}
		System.out.println("Reverse number="+rev);
	}
}
