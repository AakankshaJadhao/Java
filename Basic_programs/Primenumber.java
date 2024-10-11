/*Write a program to check whether given number is prime number or not*/
package Basic_programs;
import java.util.*;
public class Primenumber {

	public static void main(String[] args) {		
		int i,cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number.");
		int n=sc.nextInt();
		for( i=1;i<=n;i++)
		{
			if(n%i==0)
				cnt++;
		}
		if(cnt<=2)
			System.out.println("It is prime number.");
		else
			System.out.println("It is not a prime number.");
	}
}
