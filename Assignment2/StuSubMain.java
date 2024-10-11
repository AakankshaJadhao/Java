package Assignment2;
import java.util.*;
class Students{
	int rollno;
	String name;
	
}
class Subject extends Students{
	int sid;
	String sname;
	double sfees;
	
	void accept()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollno,name,sid,sname and sfees");
		rollno=sc.nextInt();
		name=sc.next();
		sid=sc.nextInt();
		sname=sc.next();
		sfees=sc.nextDouble();
		
	}
	
	void display()
	{
		System.out.println("Roll no="+rollno+"\nName="+name+"\nSubj Id="+sid+"\nSubj Name="+sname+"\nSubj Fees="+sfees);
	}
}
public class StuSubMain {

	public static void main(String[] args) {
		Subject s=new Subject();
		s.accept();
		s.display();
	}

}
