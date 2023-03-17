package seven;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacterByCharacter {
	public static void main(String[] args) throws IOException {
		File file=new File("/Users/Hari/eclipse-workspace/Exercise7/src/seven/Source.txt");
		File fileWrite=new File("/Users/Hari/eclipse-workspace/Exercise7/src/seven/Destination.txt");

		FileReader fileReader=new FileReader(file);
		FileWriter fileWriter=new FileWriter(fileWrite);
		
		int length=0;
		char charBuffer[]=new char[8];
		
		while((length=fileReader.read(charBuffer))!=-1)
		{
			fileWriter.write(charBuffer,0,length); //writing the contents in character buffer	
		}
		System.out.println("Copied source file contents to destination");
		fileWriter.close();
		fileReader.close();
	}
}
