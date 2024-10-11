/*wap to design a class manager with data members manager id, manager name,salary,project name  
 * accept the input from user and display the details using the concept of constructor.*/
package Assignment2;
import java.util.*;
class Manager{
	int id;
	String name,proj_name;
	Double sal;	

	
	Manager(int id,String name,String proj_name,double sal)
	{
		
		this.id=id;
		this.name=name;
		this.proj_name=proj_name;
		this.sal=sal;
	}
	
	void display()
	{
		System.out.println("Id="+id+"\tName="+name+"\tProj_Name="+proj_name+"\tSalary="+sal);
	}
	
}
public class ManagerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,proj_name and salary");
		int m_id=sc.nextInt();
		String m_name=sc.next();
		String m_proj_name=sc.next();
		double sal=sc.nextDouble();
		Manager m=new Manager(m_id,m_name,m_proj_name,sal);
		m.display();
	}

}
