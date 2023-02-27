package one;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenAndOdd {
  public static void main(String[] args) {
	ExecutorService executorService=Executors.newFixedThreadPool(2);
	executorService.execute(()->{
	
	 EvenAndOdd.printOdd();
	
	});
	executorService.execute(()->{
	
	EvenAndOdd.printEven();
	  
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
