package seven;

import java.util.concurrent.TimeUnit;
public class Counter {
 void printCount()
 {
	 for(int i=1;i<=100;i++)
	 {  
		 try
		 {  
			TimeUnit.MILLISECONDS.sleep(1000);
			 System.out.println("..............."+i+"...............");
			 
			 if(i%10==0)
				 System.out.println(">>>>>>>>>>Ten seconds are over<<<<<<<<<<");		 
		 }
		 catch(Exception e)
		 {
			 
		 }
		
	 }
	 System.out.println("**********Count till 100 over***********");
 }
}
