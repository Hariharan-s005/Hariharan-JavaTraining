/**
 * This program demonstrates Factory pattern
 *  @author Hariharan Shakthivel 
 */
package factorypattern;

import java.util.Scanner;

public class CountryStats { 
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 String countryName=scan.nextLine();
	 Country country=CountryFactory.getInstance(countryName);
	 if(country==null) {
		 System.out.println("No data for this Country");
		 System.exit(0);
	 }	
	   country.capital();
	   country.currency();
	   scan.close();
}
}
