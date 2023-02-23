package day1.five;

import java.util.Scanner;

public class Average {
	 public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total number of Integers whose average has to be found out: ");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" Integers whose average has to be found out:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		calculateAverage(n,a);
		scan.close();
	}

	 static void calculateAverage(int n,int a[])
	 {   int sum=0;
		 for(int i:a)
		 sum+=i;
		 int avg=sum/n;
		  System.out.println("The average is "+avg);
	 }
	}
