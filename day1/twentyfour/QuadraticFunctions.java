package day1.twentyfour;

import java.util.Scanner;



public class QuadraticFunctions {
	 public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Compute compute=new Compute();
		System.out.println(compute.a);
		System.out.println(compute.b);
		System.out.println(compute.c);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b=scan.nextInt();
		System.out.println("Enter the value of c");
		int c=scan.nextInt();

		System.out.println(compute.extractValueOfa());
		System.out.println(compute.extractValueOfb());
		System.out.println(compute.extractValueOfc());
		
		System.out.println("Enter the  new values of a,b,c");
		
		System.out.println("Enter the new value of a");
		int x=scan.nextInt();
		System.out.println("Enter the  new value of b");
		int y=scan.nextInt();
		System.out.println("Enter the new value of c");
		int z=scan.nextInt();
	  
		compute.modify(x,y,z);
		
	scan.close();
		
		
	 }

	}
	class Compute
	{   int a=0,b=0,c=0;
	    Compute()
	    {
	    	a=1;
	    	b=1;
	    	c=1;
	    }
		Compute(int a,int b,int c)
		{
			this.a=a;
			this.b=b;
			this.c=c;;
			
		}
		 int extractValueOfa()
		{
			return a;
		}
		int extractValueOfb()
		{
			return b;
		}
		int extractValueOfc()
		{
			return c;
		}
		void modify(int a,int b,int c)
		{
			this.a=a;
			this.b=b;
			this.c=c;
		}
		static void compute(int x) {
			//System.out.println();
		}
	}
		
