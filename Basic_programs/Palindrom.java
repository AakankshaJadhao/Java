/*Write a program to find whether a number entered by the user is 
  a palindrome or not(example—121,151,131)*/
package Basic_programs;
import java.util.*;
public class Palindrom {

	public static void main(String[] args) {
		int rem,rev=0,i,term;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		term=n;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(term==rev)
			System.out.println("It is palindrom number.");
		else
			System.out.println("It is not a palindrom number.");
		
	}

}
