package six;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileViewerPrintContent {
  public static void main(String[] args) throws FileNotFoundException {
	File file=new File("/Users/hari/eclipse-workspace/Exercise7/src/six/File.txt");	
		Scanner scan=new Scanner(file);	
		while(scan.hasNextLine()) {
			String contents=scan.nextLine();
			System.out.println(contents);
			}
		}
}
