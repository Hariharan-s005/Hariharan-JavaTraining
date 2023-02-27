package four;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class DigitalClock
{
 public static void main(String[] args)
 {	
  ExecutorService executorService=Executors.newFixedThreadPool(3);
   LocalTime localTime=LocalTime.now();
   int second = localTime.getSecond();
   int minute = localTime.getMinute();
   int hour = localTime.getHour();
   TimeCalculator timecalculator=new TimeCalculator();
   timecalculator.currentTime(second, minute, hour);
   
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


