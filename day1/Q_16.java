package day1;

import java.util.Scanner;

public class Q_16 {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the size of the array:");
	 int n=scan.nextInt();
	 int a[]=new int[n];
	 System.out.println("Enter the array elements:");
	 for(int i=0;i<n;i++)
	 {
		 a[i]=scan.nextInt();
	 }
	 System.out.println("Enter the element whose position has to be found:");
	 int x=scan.nextInt();
	 findLocation(x,a);
	 	 scan.close();
	 
}
  static void findLocation(int x,int a[])
  {  boolean flag=false;
	 int pos=0,count=0;
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==x) {
			 pos=i+1;
			 count++;
			 flag=true;
		 }
	   if(pos!=0&&flag)
	   {
		   System.out.println(x+" is present at "+pos+".");
		   flag=false;
	   }	  
	 }
	 if(pos!=0)
	 System.out.println(x+" is present "+count+" times.");
	 else
		 System.out.println(x+" is not present");
  }
}
