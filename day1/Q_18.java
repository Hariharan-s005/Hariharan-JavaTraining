package day1;
import java.util.*;
public class Q_18 {
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
	
}
}
