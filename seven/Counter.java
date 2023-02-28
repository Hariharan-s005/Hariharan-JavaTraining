package seven;
public class Counter {

 void printCount()
 {
	 for(int i=1;i<=100;i++)
	 {  
		 try
		 {  
			Thread.sleep(1000);     //pauses 1 second or 1000 milliseconds
			 System.out.println("..............."+i+"...............");
			 
			 if(i%10==0)
				 System.out.println(">>>>>>>>>>Ten seconds are over<<<<<<<<<<");		 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }		
	 }
	 System.out.println("**********Count till 100 over***********");
 }
}
