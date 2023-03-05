/**
 * This program provides a solution for the lorry problem
 *  @author Hariharan Shakthivel 
 */
import java.time.*;
import java.util.Scanner;

public class LorryProblem {
    public static void main(String[] args) {
    	
    	Scanner scan=new Scanner(System.in);
          	
    	System.out.println("Enter the average speed in Km/hr at which the driver will drive the truck");
    	int speed=Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the date on which the journey starts in dd:mm:yy format");
        
	   	String StartingDate=scan.nextLine();
	     
	   	int startingDay=0,startingMonth=0,startingYear=0;
	   	
	   	try {
	   	  startingDay=Integer.parseInt(StartingDate.split(":")[0].toString()); }
	   	catch(Exception e) {
	   		System.out.println("Date format wrong!");
	   		System.exit(0);
	   	}
	   	try {
	   	  startingMonth=Integer.parseInt(StartingDate.split(":")[1].toString()); }
	   	catch(Exception e) {
	   		System.out.println("Date format wrong!");
	   		System.exit(0);
	   		
	   	}
	   	try {
	   	  startingYear=Integer.parseInt(StartingDate.split(":")[2].toString()); }
	   	catch(Exception e) {
	   		System.out.println("Date format wrong!");
	   		System.exit(0);
	   		
	   	}
	   	 
        LocalDate date = LocalDate.of(startingYear, startingMonth, startingDay);
        
        System.out.println("Enter the time at which the journey starts in hh:mm format");    
        String StartingTime=scan.nextLine();
        int startingHour=0,	startingMinute=0;
    	try {
         startingHour=Integer.parseInt(StartingTime.split(":")[0].toString()); }
    	catch(Exception e) {
	   		System.out.println("Time format wrong!");
	   		System.exit(0);
	   		
	   	}
    	try {
	   	startingMinute=Integer.parseInt(StartingTime.split(":")[1].toString()); }
    	catch(Exception e) {
	   		System.out.println("Time format wrong!");
	   		System.exit(0);
	   		
	   	}
    	LocalTime time=LocalTime.now();
	   	try {
         time=LocalTime.of(startingHour, startingMinute); }
	   	catch(Exception e) {
	   		System.out.println("Time format wrong!");
	   		System.exit(0);
	   	}
        
        System.out.println("Enter the distance to be travelled in kms:");
        int distance=Integer.parseInt(scan.nextLine());
        
        
        //Calculate time of arrival
        LocalDateTime timeOfArrival = TimeCalculator.calculateArrivalTime(speed, distance, date, time, startingHour,startingMinute);
        
        //Print time of arrival
        System.out.println("Expected time of arrival: " + timeOfArrival);
        scan.close();
    }
}
    