package Arrray;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		int a[]=new int[100];
		int count=0;
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
		System.out.println("Enter elements you want to search :");
		int var=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(var==a[i])
				count++;
		}
		if(count>0)
			System.out.println("Number found.");
		else
			System.out.println("Number not found.");


	}

}
