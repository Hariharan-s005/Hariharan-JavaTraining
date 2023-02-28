/**
 * This program prints the count of all characters that are passed to it and throws an exception if it is passed a non alphabetic character.
 *  @author Hariharan Shakthivel 
 */ 
package six;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	ExecutorService es=Executors.newFixedThreadPool(1);    //Creates a thread pool that reuses a fixed number of threads.
	es.execute(()->{
  while(true) {
 		 try {
			 System.out.println("Enter the character:");
			 char c=scan.next().charAt(0);
			CharacterRunner.check(c);         //calls a method check that checks if the value passed is a character or not, if not a character it throws an exception
		} catch (NotAnAlphabetException e) {
			
			System.out.println(e.getMessage());    //prints the exception message
		    System.out.println("The count of characters is:"+CharacterRunner.count);   //print the count of Characters
			System.exit(0);  //terminates the JVM
		}
}
	});
	es.shutdown();
	
	}
}

