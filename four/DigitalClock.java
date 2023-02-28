/**
 * This program functions as a digital clock.
 *  @author Hariharan Shakthivel 
 */ 
package four;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DigitalClock
{
 public static void main(String[] args)
 {	
  ExecutorService executorService=Executors.newFixedThreadPool(3);    //Creates a thread pool that reuses a fixed number of threads.
   LocalTime localTime=LocalTime.now();     //stores the local time in localTime variable
   int second = localTime.getSecond();
   int minute = localTime.getMinute();
   int hour = localTime.getHour();
   TimeCalculator timecalculator=new TimeCalculator();  
   timecalculator.currentTime(second, minute, hour);    //sets the current time
   
   executorService.execute(()->{
	   while(true)
	   {	
		timecalculator.seconds();   
			
		}   
   });
   executorService.execute(()->{
	   while(true)
	   {	
		   timecalculator.minutes();
		
	   }
   });
   executorService.execute(()->{
	   while(true)
	   {	
		   timecalculator.hours();
	   }
   });
 }   
}


