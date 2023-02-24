package nine;

import java.util.Scanner;
public class OwnFormatExceptions {
	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
   int a=0,i=0;
   while(i<10) {
   	try 
	{   System.out.println("Enter the marks of the student"+(i+1));    
        a=Integer.parseInt(scan.nextLine());
        if(a<0)
        	 throw new NegativeValueException("The number entered is negative");
        if(a>100)
	    	throw new OutofRangeException("The number entered is Out of range");
    	sum+=a;
         i++;
         
	 }
	catch(NumberFormatException e)
	{
	    
		System.out.println("Enter an Integer");				
	}
   	catch(OutofRangeException e)
   	{
   		System.out.println(e);
   	}
   	catch(NegativeValueException e) {
   		System.out.println(e);
   	} 
   }
  System.out.println("Average of marks of 10 students is:"+sum/10);
  scan.close();
}
}
class NegativeValueException extends Exception
{
	String NegativeValueError;
	public NegativeValueException(String NegativeValueError)
	{
		 this.NegativeValueError=NegativeValueError;
	}
	public String toString() {
		return NegativeValueError;
	}
}
class OutofRangeException extends Exception
{
	String OutofRangeError;
	public OutofRangeException(String OutofRangeError) {
		this.OutofRangeError=OutofRangeError;
   	}
	@Override
	public String toString()
	{
		return OutofRangeError;
	}	
}

