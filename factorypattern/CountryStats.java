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
	 
	 Country country=CountryFactory.getInstance(countryName);  //creates object for the Country name user has entered
 
	   country.capital();  //calls capital method
	   country.currency(); //calls currency method
	   scan.close();
}
}
