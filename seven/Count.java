/**
 * This program creates a simple counting thread that counts till 100 with a one second pause and prints a message every 10 counts.
 *  @author Hariharan Shakthivel 
 */ 
package seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Count {
   public static void main(String[] args) {
	ExecutorService executorService=Executors.newFixedThreadPool(1);    //Creates a thread pool that reuses a fixed number of threads.
	Counter counter=new Counter();
	executorService.execute(()->{
		System.out.println("**********Count till 100**********");
		counter.printCount();   //calls a method that  counts till 100 with a one second pause and prints a message every 10 counts.
	});
	executorService.shutdown(); //previously started tasks are shutdown.
}
}
