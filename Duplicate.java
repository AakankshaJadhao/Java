package Arrray;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		int a[]=new int[100];
		int b[]=new int [100];
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("original Array ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
			System.out.println(a[i]);

		}
	}

}
