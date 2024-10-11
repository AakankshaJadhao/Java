package Arrray;
import java.util.*;
public class SumAtIndex {

	public static void main(String[] args) {
		int a[]=new int[100];
		int sum_even=0,sum_odd=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are as follow:");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}			
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				sum_even=sum_even+a[i];
			else
				sum_odd=sum_odd+a[i];
		}
		System.out.println("Sum of all Array elements at even index "+sum_even);
		System.out.println("Sum of all Array elements at odd index "+sum_odd);

	}

}
