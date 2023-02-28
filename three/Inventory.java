/**
 * This program implements an inventory system in which the producer produces the product and the consumer consumes the product.There are maximum one products and minimum zero products in the inventory.
 *  @author Hariharan Shakthivel 
 */ 
package three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory 
{
	
  public static void main(String[]args) 
  {
	  
	  ExecutorService executorService=Executors.newFixedThreadPool(2);  //Creates a thread pool that reuses a fixed number of threads.
	  Sales sales=new Sales();
	  executorService.execute(()->{
		 
		   sales.produce();  //calls a method that increases the item count
		   sales.produce();
		   
      });
	  executorService.execute(()->{
		  
			sales.consume();  //calls a method that decreases the item count
			sales.consume();
	  });
	  executorService.shutdown();
 }
}
