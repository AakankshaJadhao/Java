package Assignment2;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		 String input=sc.nextLine();
		 
		 char charArray[]= input.toCharArray();
		 for(int i=0, j = charArray.length-1 ;i < j;i++, j--)
		 {
			 char temp=charArray[i];
			 charArray[i]=charArray[j];
			 charArray[j]=temp;
		 }
		 String reversed=new String(charArray);
		 System.out.println("Reverse string ="+reversed);
		 
		 
	}

}
