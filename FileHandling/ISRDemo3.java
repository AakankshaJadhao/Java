package FileHandling;
import java.io.*;
public class ISRDemo3 {

	public static void main(String[] args) throws IOException{
		String ch;
		File f=new File("a3.txt");
		f.createNewFile();
	    System.out.println(f.getAbsolutePath());
	    FileWriter fw=new FileWriter("a3.txt");
	    String txt="Welcome to world of coding!!";
	    PrintWriter pw=new PrintWriter(fw);
	    pw.write(txt);
	    pw.flush();
	    pw.close();
	    
	    FileReader fr =new FileReader("a3.txt");
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

