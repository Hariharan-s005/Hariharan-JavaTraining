package eight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyLineByLine {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new FileReader("/Users/Hari/eclipse-workspace/Exercise7/src/eight/Source.txt"));
		
		PrintWriter printWriter=new PrintWriter(new FileWriter("/Users/Hari/eclipse-workspace/Exercise7/src/eight/Destination.txt"));
		
		String input;
		while((input=bufferedReader.readLine())!=null) {
			System.out.println(input);
			printWriter.write(input);
		}
		bufferedReader.close();
		printWriter.close();
	}
}
