/**
 * This program demonstrates Memento pattern
 *  @author Hariharan Shakthivel 
 */
package mementopattern;

import java.util.Scanner;

public class ConvertorDriver {
	
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	UnitConvertor unitConvertor=new UnitConvertorImp();   //creates object for UnitConvertor
	
	System.out.println("Enter the distance in miles:");  
	double miles=scan.nextDouble();   
	unitConvertor.setMiles(miles);   //sets miles
	
	System.out.println("In Kilometres:"+unitConvertor.getConversionResult());  //prints result
	
	PreviousConversionToCaretaker memento=unitConvertor.backupLastResult();    //creates mememto, creates backup
	System.out.println();
	System.out.println("Enter the distance in miles:");     
	miles=scan.nextDouble();
	unitConvertor.setMiles(miles);   //sets miles
	
	System.out.println("In Kilometres:"+unitConvertor.getConversionResult());  //prints new result
	
	
	
	
	unitConvertor.restorePreviousConversion(memento);  //restores previous conversion value
	System.out.println("**********Restored result in Kilometres:"+unitConvertor.getConversionResult()+"************");  //displays restored result
	scan.close();
	}
}

