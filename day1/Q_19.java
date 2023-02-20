package day1;

import java.util.*;

public class Q_19 {
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
	reverseElements(a,n,m);
	scan.close();
	}
	static void reverseElements(int a[][],int n,int m)
	{
		for (int i=0;i<n;i++) {
	        int start=0;
	        int end=m-1;
	        while(start< end) {
	            int temp =a[i][start];
	            a[i][start]=a[i][end];
	            a[i][end]=temp;
	            start++;
	            end--;
	        }
	    }
	    for (int i=0;i<n;i++) {
	        for (int j=0;j<m;j++) {
	            System.out.print(a[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}

