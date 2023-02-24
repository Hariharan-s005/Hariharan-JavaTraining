package seven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 String numerator,denominator;
	 float result;
	 while(true)
	 {
		 System.out.println("Enter the Numerator:");
		 numerator=scan.nextLine();
		 if(numerator.startsWith("Q")||numerator.startsWith("q"))
		 {
			 System.out.println("Data entered for numerator starts with Q or q");
			 System.out.println("Exiting.....");
			 return;
		 }
		 System.out.println("Enter the Denominator");
		 denominator=scan.nextLine();
        try
        {   int num=Integer.valueOf(numerator);
            int den=Integer.valueOf(denominator);
        	result=num/den;
        	System.out.println(numerator+"/"+denominator+"="+result);
        }
        catch(NumberFormatException e)
        {
        	System.out.println("Number format wrong");
        }
        catch(ArithmeticException e)
        {
        	System.out.println("Division by zero not possible");
        }
        catch(InputMismatchException e)
        {
        	System.out.println("Input typw wrong");
        }
}
}
}
