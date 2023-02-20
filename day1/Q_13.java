package day1;
import java.util.*;
public class Q_13 {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
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
	calculateResult(a,n,m);
	scan.close();
}
 static void calculateResult(int a[][],int n,int m)
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
