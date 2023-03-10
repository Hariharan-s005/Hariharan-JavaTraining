package three;

import java.io.File;

public class FileSizeDisplayExample {
  public static void main(String[] args) {
	File file=new File(Path.pathName+"demo.txt");
	  if(file.exists()) 
	  {
		long length=file.length();
		System.out.println("The size of the file is "+length+" bytes.");		
	  }
	  else 
	  {
		System.out.println("File was not found.");
	  }
    }
}
