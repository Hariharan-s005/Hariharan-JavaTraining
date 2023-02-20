package day1;

import java.util.Scanner;

public class Q_15b {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	boolean flag=true;
	System.out.println("Enter the number:");
	int n=scan.nextInt();
	if(isArmstrong(n)) {
		System.out.println(n+" is an Armstrong Number.");
		flag=false;
	}
    if(isPerfectNumber(n)) {
		System.out.println(n+" is a Perfect Number.");
		flag=false;
    }
    if(isPallindrome(n)) {
		System.out.println(n+" is a Pallindrome.");
		flag=false;
    }
	if(flag)
		System.out.println(n+ " is not an Armstrong Number, a Perfect Number or a Pallindrome.");
	scan.close();
}
 static boolean isArmstrong(int n)
 {   
	 int temp1=n,temp2=n;
	 int totalDigits=0,sum=0;
	 while(temp1!=0)
	 {
		 temp1/=10;
		 totalDigits++;
		 
	 }
	 while(n>0){ 
         int rem=n%10;
         sum+=Math.pow(rem,totalDigits);
         n=n/10;
     }
	 if(sum==temp2)
		 return true;
	 return false;
	 
 }
 static boolean isPerfectNumber(int n)
 {   
	 int sum=0;
	 for(int i=1;i<n;i++)
	 {
		 if(n%i==0)
			 sum+=i;
	 }
	 if(sum==n)
		 return true;
     return false;
		 
 }
 static boolean isPallindrome(int n)
 {
	 int rev=0;
	 int temp=n;
	 while (temp!=0){
	   rev=(rev*10)+(temp % 10);
	      temp=temp/10;
	    }
	    if(rev==n)
	    	return true;
       return false;
}
}
