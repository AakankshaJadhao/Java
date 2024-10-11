package Assignment2;
class Colleges{
	
	private int id;
	private String name,add,type;
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
		
	}
	public String getAdd()
	{
		return add;
	}
	public String getType()
	{
		return type;
	}
	
	public void setId(int id)
	{
		this.id = id;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAdd(String add)
	{
		this.add=add;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	
	@Override
	public String toString()
	{
		return "Colleges [Id="+id+",Name="+name+",add"+add+",Type="+type+"]";
	}
}
public class CollegesMain {

	public static void main(String[] args) {
		Colleges c=new Colleges();
		c.setAdd("Pune");
		c.setId(69);
		c.setName("Poona");
		c.setType("SPPU");

		System.out.println(c);
		
		Colleges co=new Colleges();
		co.setAdd("Delhi");
		co.setId(1);
		co.setName("IIT");
		co.setType("Govt");
		
		System.out.println(co);

	}

}
