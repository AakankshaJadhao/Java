package FileHandling;
import java.io.*;
public class Demo {

	public static void main(String[] args) throws IOException {
		File f1=new File("a1.txt");
	    f1.createNewFile();
	    System.out.println("File created success!!");
	    System.out.println("Size in bytes="+f1.length());
	    System.out.println("Can execute?="+f1.canExecute());
	    System.out.println("Can read?="+f1.canRead());
	    System.out.println("Can write?="+f1.canWrite());
	    System.out.println("Get Absolute Path="+f1.getAbsolutePath());
	    System.out.println("Get Path="+f1.getPath());
	    System.out.println("Get Canconial Path="+f1.getCanonicalPath());
	    System.out.println("Is File or not="+f1.isFile());

	    File f2=new File("FileDemos");
	    f2.mkdir();

	    String []li=f2.list();
	    System.out.println("Directory elements are as follows:");
	    for(String x:li)
	      System.out.println(x);
	    
	    f1.delete();
	    System.out.println("File exists?="+f1.exists());
	    f2.delete();
	    
	  }
	
}
