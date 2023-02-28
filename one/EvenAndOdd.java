/**
 * This program creates two threads one to display even and other to display odd numbers from 1 to 100.
 *  @author Hariharan Shakthivel 
 */ 
package one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenAndOdd {
  public static void main(String[] args) {
	ExecutorService executorService=Executors.newFixedThreadPool(2);  //Creates a thread pool that reuses a fixed number of threads
	executorService.execute(()->{
	
	 EvenAndOdd.printOdd();   //calls a method that prints Odd numbers from 1 to 100
	
	});
	executorService.execute(()->{
	
	EvenAndOdd.printEven();   //calls a method that prints Even numbers from 1 to 100
	  
	});
	executorService.shutdown();
	
}
   synchronized static void printOdd()
   {  
	   System.out.println("Odd numbers:");
	   for(int i=1;i<100;i+=2)
		  {
			  System.out.println(i);
		  }
   }
   synchronized static void printEven()
   {   
	   System.out.println("Even numbers:");
	   for(int i=2;i<=100;i+=2)
		  {
			  System.out.println(i);
		  }
   }
}
