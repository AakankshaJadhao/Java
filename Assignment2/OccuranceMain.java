package Assignment2;
import java.util.*;
public class OccuranceMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		int cnt[]=new int[300];
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			cnt[(int) str.charAt(i)]++;
		}
		
		System.out.println("occurance of letter");
		for (int i=0;i<cnt.length;i++)
		{
			if(cnt[i]!=0)
				System.out.println((char)i+"="+cnt[i]);
		}
	}

}
