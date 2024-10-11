package Exception;
class Nested{
	
	void accept()
	{
		try 
		{
			int a[]=new int[]{1,2,3,4};
			System.out.println(a[20]);

			try 
			{
				String s=null;
				System.out.println("String length"+s.length());
				
			}
			catch(Exception ex)
			{
				System.out.println("inside inner catch");
				System.out.println(ex.getMessage());
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("inside outer catch");
			System.out.println(ex.getMessage());
		}

		finally {
			System.out.println("Inside finally block");
			//System.exit(0);
		}
		
	}
	
}
public class NestedTryCatch {

	public static void main(String[] args) {
		Nested n =new Nested();
		n.accept();
	}

}
