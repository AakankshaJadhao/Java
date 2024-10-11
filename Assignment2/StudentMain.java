package Assignment2;
import java.util.*;
class Student{
	int rollno;
	String name;
	double marks;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll.no,name and marks");
		rollno=sc.nextInt();
		name=sc.next();
		marks=sc.nextDouble();
	}
	
	void display()
	{
		System.out.println("Roll no="+rollno+"\nName="+name+"\nMarks="+marks);		
	}
	
}
public class StudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of student");
		int n=sc.nextInt();
		Student s1[]=new Student[n];
		for(int i=0;i<s1.length;i++)
		{
			s.accept();
			s.display();
			
		}		
	}

}
