package day1.four;

import java.util.Scanner;

public class PrimeOrNot {
	  public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
		    System.out.println("Please enter the number: ");
		    int num=scan.nextInt();
		    if(isPrime(num))
		    System.out.println(num+" is a Prime number");
		    else
		    System.out.println(num+" is not a Prime number");
		    scan.close();
	  }
	 public static boolean isPrime(int n)
	  {
	 	 if(n==1)
	 		 return false;
	 	 for(int j=2;j<=n/2;j++)
	 	 {
	 		 if(n%j==0)
	 			 return false;
	 	 }
	 	 return true;
	  }
}

