/*Write a program check whether given number is armstrong number or not*/
package Basic_programs;
import java.util.*;
public class Armstrongnum {

	public static void main(String[] args) {
		int rev=0,rem,term;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3-digit  number.");
		int n=sc.nextInt();
		term=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev+(rem*rem*rem);
			n=n/10;
		}
		if(term==rev)
			System.out.println("It is palindrom number.");
		else
			System.out.println("It is not a palindrom number.");
	}
}
