package four;

import java.io.File;

public class ListFilesAndDirectories {
	
	public static void main(String[] args) {
		File Directory=new File("/Users/Hari/eclipse-workspace/Exercise7/src");
     	File list[]=Directory.listFiles();	
		for(int i=0;i<list.length;i++)
		{	
		  System.out.println(list[i].getName());
		}	
	}
}
