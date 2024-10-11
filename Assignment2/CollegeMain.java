package Assignment2;
class College{
	int id;
	String name,address,type;
	
	College(int id,String name,String address,String type)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		this.type=type;
		
	}
	
	void show()
	{
		System.out.println("Id="+id+"\tName="+name+"\nAddress="+address+"\tType="+type);
	}
	
}
public class CollegeMain {

	public static void main(String[] args) {
		College c1=new College(101,"BHalerao Jr. Science College","Saoner","Goverment");
		c1.show();
	}

}
