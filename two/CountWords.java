package two;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String sentence=scan.nextLine();
		
		System.out.println("The total number of words in the string is "+sentence.split(" ").length);
		scan.close();
	}
	
	
}