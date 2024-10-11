/*write program to display even and odd numbers from 1 to 100*/
package Basic_programs;
public class Evenoddnumber {

	public static void main(String[] args) {
		int i,n=100;
		System.out.println("All even numbers.");
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("All odd numbers.");
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}
