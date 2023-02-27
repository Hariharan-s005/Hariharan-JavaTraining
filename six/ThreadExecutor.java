package six;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	ExecutorService es=Executors.newFixedThreadPool(1);
	es.execute(()->{
  while(true) {
 		 try {
			 System.out.println("Enter the character:");
			 char c=scan.next().charAt(0);
			CharacterRunner.check(c);
		} catch (NotAnAlphabetException e) {
			
			System.out.println(e.getMessage());
		    System.out.println("The count of characters is:"+CharacterRunner.count);
			System.exit(0);
		}
}
	});
	es.shutdown();
	scan.close();
	}
}

