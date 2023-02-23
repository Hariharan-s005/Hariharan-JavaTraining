package day1.eight;

import java.util.Scanner;
public class ElementLocation{
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
	 int location=findLocation(x,a);
	 if(location==0)
		 System.out.println("Element not found!");
	 else
	 System.out.println("Element "+x+" is at "+location+".");
	 scan.close();
	 
}
  static int findLocation(int x,int a[])
  {   
	 int pos=0;
	 for(int i=0;i<a.length;i++)
		 if(a[i]==x)
			 pos=i+1;
	  
	  
	  return pos;
	  
  }
}
