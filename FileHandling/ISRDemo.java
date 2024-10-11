package FileHandling;
import java.io.*;
public class ISRDemo {

	public static void main(String[] args) throws IOException {
		
//		InputStreamReader isr=new InputStreamReader(System.in);
//		BufferedReader br=new BufferedReader(isr);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Data");
//		char ch=(char)br.read();
//		System.out.println("Your Data=\t"+ch);
		
		String text=br.readLine();
		System.out.println("Your Data=\t"+text);

	}

}
