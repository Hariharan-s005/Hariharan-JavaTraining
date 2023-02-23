package day1.twentyone;

import java.util.Scanner;
public class NumberOfDays {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.printf("Enter month name: ");
	    String month = scan.nextLine();
        findDays(month.toLowerCase());
        scan.close();
	}
	    static void findDays(String month) {
	    	Scanner scan1=new Scanner(System.in);
	    	int days;
	    switch (month) {
	    case "april":
	    case "june":
	    case "september":
	    case "november":
	      days = 30;
	      break;

	    case "january":
	    case "march":
	    case "may":
	    case "july":
	    case "august":
	    case "october":
	    case "december":
	      days = 31;
	      break;

	    case "february":
	    	System.out.println("Enter the current year: ");
	    	int year=scan1.nextInt();
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
	    scan1.close();
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

	