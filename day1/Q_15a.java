package day1;

public class Q_15a {
 public static void main(String[] args) {
	printPrimesinRange(1,100);
}
 static void printPrimesinRange(int x,int y)
 {  
	 System.out.println("Prime numbers between "+x+" and "+y+"are: ");
	 for(int i=x;i<=y;i++)
	 {   
		 if(isPrime(i))
			 System.out.println(i+" ");
	 }
 }
 static boolean isPrime(int n)
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
