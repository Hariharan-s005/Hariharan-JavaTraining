package three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Inventory 
{
	
  public static void main(String[]args) 
  {
	  
	  ExecutorService executorService=Executors.newFixedThreadPool(2);
	  Sales sales=new Sales();
	  executorService.execute(()->{
		 
		   sales.produce();
		   sales.produce();
		   
      });
	  executorService.execute(()->{
		  
			sales.consume();  
			sales.consume();
	  });
	  executorService.shutdown();
 }
}
