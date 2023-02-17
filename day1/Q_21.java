package day1;
import java.util.*;
public class Q_21 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.printf("Enter month name: ");
	    String month = scan.nextLine();
        findDays(month);
	}
	    static void findDays(String month) {
	    	int days;
	    switch (month) {
	    case "April":
	    case "June":
	    case "September":
	    case "November":
	      days = 30;
	      break;

	    case "January":
	    case "March":
	    case "May":
	    case "July":
	    case "August":
	    case "October":
	    case "December":
	      days = 31;
	      break;

	    case "February":
	    	System.out.println("Enter the current year: ");
	    	int year=scan.nextInt();
	    	if(checkLeap(year))
	    		days=29;
	    	else
	    		days=28;
	      break;

	    default:
	      days = 0;
	      break;
	    }
	    if (days != 0)
	      System.out.println("Total days is "+days);
	    else
	      System.out.println("Please enter the correct month name");
	  }
	static boolean checkLeap(int year)
	{
	    if (year % 4 == 0) {
	    	if (year % 100 == 0)
	    	{
	    		if (year % 400 == 0)
	            return true;
	    	}
	    }
	    return false;
	 }
}

	

	
