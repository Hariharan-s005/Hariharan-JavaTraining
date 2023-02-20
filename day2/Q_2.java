package day2;
import java.util.*;
public class Q_2 {
	int realPart,imaginaryPart;
	   public Q_2(int realPart,int imaginaryPart)
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
		
		Q_2 c1=new Q_2(realPart1,imaginaryPart1);
		Q_2 c2=new Q_2(realPart2,imaginaryPart2);
	
		    
		       Q_2 res=add(c1,c2);
		       res.print();
		       scan.close();
	}   
		     
   public void print()
	  {
		  System.out.println(this.realPart+" +"+this.imaginaryPart+"i");
	  }
   public static Q_2 add(Q_2 x,Q_2 y)
	  {
		    Q_2 ans=new Q_2(0,0);
		    ans.realPart=x.realPart+y.realPart;
		    ans.imaginaryPart=x.imaginaryPart+y.imaginaryPart;
		    return ans;
	  }	  
}


