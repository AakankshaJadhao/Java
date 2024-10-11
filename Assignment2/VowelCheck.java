package Assignment2;
import java.util.*;
public class VowelCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		
		input= input.toLowerCase();
        boolean foundVowel = false;
        
        for(char ch:input.toCharArray())
        {
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        	{
        		foundVowel=true;
        		break;
        	}
        }
        if(foundVowel)
        {
        	System.out.println("Vowel is present in the string");
        }
        else
        {
        	System.out.println("Vowel is not present in the string");

        }
        
	}

}
