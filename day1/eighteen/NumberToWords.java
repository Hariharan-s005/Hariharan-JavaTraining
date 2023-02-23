package day1.eighteen;

import java.util.Scanner;
public class NumberToWords {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number:");
	String S=scan.nextLine();
	String words[]=new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}; 
	System.out.println("In words: ");
    for(char c:S.toCharArray())
    {
    	System.out.print(words[c-'0']+" ");
    }
	scan.close();
}
}
