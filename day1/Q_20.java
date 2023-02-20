package day1;

import java.util.Scanner;

public class Q_20 {
	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	 System.out.println("Enter the total number of Rows: ");
	 int n=scan.nextInt();
	 System.out.println("Enter the total number of Columns: ");
	 int m=scan.nextInt();
	 int a[][]=new int[n][m];
	 System.out.println("Enter the array elements: ");
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<m;j++)
		   a[i][j]=scan.nextInt();
	 }
	 findLargest(a,n,m);
	 scan.close();

 }
	static void findLargest(int a[][],int n,int m)
	{
		for(int i=0;i<n;i++)
		{   int max=0;
			for(int j=0;j<m;j++)
			{
				max=Math.max(a[i][j], max);
			}
			System.out.println("The largest element in row "+(i+1)+" is: "+max);
		}
	}
	
}
