package FileHandling;
import java.io.*;
public class ISRDemo2 {

	public static void main(String[] args) throws IOException {
		String ch;
		File f1=new File("a2.txt");
	    f1.createNewFile();
	    System.out.println("Get Absolute Path="+f1.getAbsolutePath());;
		FileReader fr =new FileReader("C:\\Users\\DELL\\eclipse-workspace\\Java_Augest\\a2.txt");
		BufferedReader br=new BufferedReader(fr);
		System.out.println("File contain are as follow:");
    	while((ch=br.readLine())!=null)
		{
			System.out.println(ch);
		}
		fr.close();
		br.close();
	}

}
