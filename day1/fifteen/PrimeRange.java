package day1.fifteen;
import  day1.four.PrimeOrNot;
public class PrimeRange {
	 public static void main(String[] args) {
		printPrimesinRange(1,100);
	}
	 static void printPrimesinRange(int x,int y)
	 {  
		 System.out.println("Prime numbers between "+x+" and "+y+"are: ");
		 for(int i=x;i<=y;i++)
		 {   
			 if(PrimeOrNot.isPrime(i))
				 System.out.println(i+" ");
		 }
	 }
}