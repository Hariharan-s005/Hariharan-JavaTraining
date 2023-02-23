package day1.thirteen;

import java.util.Scanner;

public class Result {
	 public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Result result=new Result();
		System.out.println("Enter the total number of students:");
		int n=scan.nextInt();
		System.out.println("Enter the total number of subjects:");
		int m=scan.nextInt();
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter student "+(i+1)+"'s marks:");
			System.out.println();
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter subject "+(j+1)+"'s marks:");
				a[i][j]=scan.nextInt();
			}
		}
		result.calculateResult(a,n,m);
		scan.close();
	}
	  void calculateResult(int a[][],int n,int m)
	 {
		 for(int i=0;i<n;i++)
		 {   int sum=0;
			 for(int j=0;j<m;j++)
			 {
				 sum+=a[i][j];
			 }
			 System.out.println("Student "+(i+1)+" scored a total of "+sum+" marks.");
		 }
	 }
	}