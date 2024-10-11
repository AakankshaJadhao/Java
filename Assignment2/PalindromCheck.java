package Assignment2;
import java.util.*;
public class PalindromCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String input=sc.nextLine();
		
		StringBuffer sb=new StringBuffer(input);
		sb.reverse();
		
		if(input.equals(sb.toString()))
		{
			System.out.println("It is palindrom number");
		}
		else
		{
			System.out.println("It is not a palindrom number.");
		}
		
		
	}

}
