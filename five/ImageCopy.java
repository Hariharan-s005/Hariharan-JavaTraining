package five;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	public static void main(String[] args) throws IOException {
		File file=new File("/Users/Hari/eclipse-workspace/Exercise7/src/five/luffy.jpg");
		File copyPath=new File("/Users/Hari/eclipse-workspace/Exercise7/src/five/byteByByteCopy.jpg");
			
		FileInputStream inputStream=new FileInputStream(file);  //input and output stream to read and write file in byte format
		FileOutputStream outputStream=new FileOutputStream(copyPath);
	
			int i=0;			
			byte b[]=new byte[1024];
			
			while((i=inputStream.read(b))!=-1) 
			{
				outputStream.write(b);
	
			}
			System.out.println("Byte by Byte copying of image done successfully");
			inputStream.close();
			outputStream.close();		
		}
}