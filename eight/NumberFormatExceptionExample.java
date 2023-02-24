package eight;
import java.util.Scanner;
public class NumberFormatExceptionExample {
	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		int sum=0;
		
   int i=0;
  while(i<10) {
   	try 
	{   System.out.println("Enter the marks of the student"+(i+1));
        int a=Integer.parseInt(scan.nextLine());
    	sum+=a;
         i++;
	 }
	catch(NumberFormatException e)
	{
	    
		System.out.println("Enter an Integer");				
	} 
      

   }
  System.out.println("Average of marks of 10 students is:"+sum/10);
  scan.close();
}
}


