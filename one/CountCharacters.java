package one;
import java.util.Scanner;

public class CountCharacters {
	public static void main(String[] args) {	
		try(Scanner scan=new Scanner(System.in)) 
		{	
			int count=0;
			while(scan.hasNext()) 
			{
				String line=scan.nextLine();
				count+=line.length();
			}
			System.out.println(count);
		}
		catch(Exception e)
		{
			System.out.println(e);

		}
	}
}