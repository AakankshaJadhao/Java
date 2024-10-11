package FileHandling;
import java.io.*;
class Employee implements Serializable {
	int id;
	String empname;
	double sal;
	
	public Employee(int id, String empname, double sal) {
		super();
		this.id = id;
		this.empname = empname;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empname=" + empname + ", sal=" + sal + "]";
	}
}
public class EmployeeMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialization
		FileOutputStream fos=new FileOutputStream("f1.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(new Employee(101,"riya",135000));
		fos.close();
		oos.close();
		
		//deserialization
		FileInputStream fis=new FileInputStream("f1.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Employee e=(Employee)ois.readObject();
		System.out.println("Employee Detail are as follow.");
		System.out.println(e);
		
		
		
		
	}

}
