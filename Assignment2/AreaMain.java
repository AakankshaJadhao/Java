package Assignment2;
class Area{
	
	void area(double r)
	{
		System.out.println("Area of circle ="+(3.14*r*r));
	}
	void area(float l,float b)
	{
		System.out.println("Area of Rectangle ="+(l*b));
	}
	void area(int h,int  b)
	{
		System.out.println("Area of circle ="+(0.5*h*b));

	}
}
public class AreaMain {

	public static void main(String[] args) {
		Area a1=new Area();
		a1.area(2.4);
		
		Area a2=new Area();
		a2.area(10, 5);
		
		Area a3=new Area();
		a3.area(5, 4);
	}

}
