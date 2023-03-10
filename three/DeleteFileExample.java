package three;
import java.io.File;

public class DeleteFileExample {
  public static void main(String[] args) {
	File  file=new File(Path.pathName+"/demo.txt");
	  if(file.delete())
	  {
	    System.out.println("File Deleted Sucessfully");
	  }
	  else
      {
		System.out.println("Operatiion failed");
	   }
	}
}