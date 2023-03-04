/**
 * This program demonstrates bridge pattern
 *  @author Hariharan Shakthivel 
 */
import java.time.*;
import java.util.Scanner;

public class LorryProblem {
    public static void main(String[] args) {
    	
    	Scanner scan=new Scanner(System.in);
          	
    	System.out.println("Enter the average speed at which the driver will drive the truck");
    	int speed=Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the date on which the journey starts:");
	   	 String StartingDate=scan.nextLine();
	
	   	 int startingDay=Integer.parseInt(StartingDate.split(":")[0].toString());
	   	 int startingMonth=Integer.parseInt(StartingDate.split(":")[1].toString());
	   	 int startingYear=Integer.parseInt(StartingDate.split(":")[2].toString());
	   	 
        LocalDate date = LocalDate.of(startingYear, startingMonth, startingDay);
        
        System.out.println("Enter the time at which the journey starts:");    
        String StartingTime=scan.nextLine();
        
        int startingHour=Integer.parseInt(StartingTime.split(":")[0].toString());
	   	int startingMinute=Integer.parseInt(StartingTime.split(":")[1].toString());
	   	
        LocalTime time=LocalTime.of(startingHour, startingMinute); 
        
        System.out.println("Enter the distance:");
        int distance=Integer.parseInt(scan.nextLine());
        
        
        //Calculate time of arrival
        LocalDateTime timeOfArrival = TimeCalculator.calculateArrivalTime(speed, distance, date, time, startingHour,startingMinute);
        
        //Print time of arrival
        System.out.println("Expected time of arrival: " + timeOfArrival);
        scan.close();
    }
}
    