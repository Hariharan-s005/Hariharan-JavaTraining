package day2.two;

import java.util.Scanner;


public class ComplexNumber {
	int realPart,imaginaryPart;
	   public ComplexNumber(int realPart,int imaginaryPart)
		  {
			  this.realPart=realPart;
			  this.imaginaryPart=imaginaryPart;
		  }
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		System.out.println("Enter the real part of first number");
		int realPart1=scan.nextInt();
		System.out.println("Enter the imaginary part of the first number:");
		int imaginaryPart1=scan.nextInt();
		System.out.println("Enter the second number");
		System.out.println("Enter the real part of first number");
		int realPart2=scan.nextInt();
		System.out.println("Enter the imaginary part of the second number:");
		int imaginaryPart2=scan.nextInt();
		
		ComplexNumber c1=new ComplexNumber(realPart1,imaginaryPart1);
		ComplexNumber c2=new ComplexNumber(realPart2,imaginaryPart2);
	
		    
		ComplexNumber res=add(c1,c2);
		       res.print();
		       scan.close();
	}   
		     
   public void print()
	  {
		  System.out.println(this.realPart+" +"+this.imaginaryPart+"i");
	  }
   public static ComplexNumber add(ComplexNumber x,ComplexNumber y)
	  {
	   ComplexNumber ans=new ComplexNumber(0,0);
		    ans.realPart=x.realPart+y.realPart;
		    ans.imaginaryPart=x.imaginaryPart+y.imaginaryPart;
		    return ans;
	  }	  
}

