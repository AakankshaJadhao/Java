package Assignment2;
import java.util.*;
public class RemoveExtraWhitespaces {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        String result = removeExtraWhitespaces(input);
        
        System.out.println("String with extra whitespaces removed:");
        System.out.println(result);
        
        sc.close();
	}
	public static String removeExtraWhitespaces(String str) {
        return str.replaceAll("\\s+", " ").trim();
    }
}
