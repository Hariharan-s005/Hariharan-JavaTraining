package nine;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ReadWriteDateObject {
public static void main(String[] args) throws IOException {	
		Date date= new Date();	
		FileOutputStream fileOutputStream;
		
		fileOutputStream=new FileOutputStream("/Users/Hari/eclipse-workspace/Exercise7/src/nine/Date.txt");
		
			ObjectOutputStream objectOutputstream=new ObjectOutputStream(fileOutputStream);		
			objectOutputstream.writeObject(date);
			
			BufferedReader bufferedreader=new BufferedReader(new FileReader("/Users/Hari/eclipse-workspace/Exercise7/src/nine/Date.txt"));	
			String s;
			 while((s=bufferedreader.readLine())!=null) 
			 {
				 System.out.println(s);
			 }
			 objectOutputstream.close();
			 bufferedreader.close();
	}
}
