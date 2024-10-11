package Assignment2;
class Emp{
	int eid;
	String name;
	double sal;
	
	Emp(int eid,String name,double sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		
	}
	@Override
	public String toString()
	{
		return "Emp[eid="+eid+"Name="+name+"Salary="+sal+"]";
	}
}
class Dept{
	int did;
	String dname,ename;
	
	Emp e;
	Dept(int did,String dname,String ename)
	{
		super();
		this.did=did;
		this.dname=dname;
		this.ename=ename;
	}
	@Override
	public String toString()
	{
		return "Dept[did="+did+"dname="+dname+"ename="+ename+"]";
	}
}
public class EmpDeptMain {

	public static void main(String[] args) {
		Emp e1=new Emp(101,"Raja",30000.0);
		Dept d1=new Dept(1,"CSE","e1");
		System.out.println(e1);
		System.out.println(d1);
	}

}
