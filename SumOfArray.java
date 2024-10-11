package Arrray;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		int a[]=new int[100];
		int sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Array elements are as follow:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}			
		System.out.println("Sum of all Array elements are "+sum);

		
	}

}
