package three;

import java.io.File;

public class RenameFileExample {
	public static void main(String[] args) {
		File file = new File(Path.pathName+"/demo.txt");	
		File rename = new File(Path.pathName+"demoRenamed.txt");	
		if(file.exists()) {
			file.renameTo(rename);
			System.out.println("File has been renamed");
		}else {
			System.out.println("File was not found");
		}
	}
}
