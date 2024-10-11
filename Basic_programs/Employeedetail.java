/*Write a program to take input from user for empId , name, salary and print the Employee Details.*/
package Basic_programs;
import java.util.*;
public class Employeedetail {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter empId,name and salary");
		int empid=sc.nextInt();
		String name=sc.next();
		double sal=sc.nextDouble();
		System.out.println("empid="+empid+"\tName="+name+"\tSalary="+sal);
	}
}
