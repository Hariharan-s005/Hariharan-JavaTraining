package day1;
import java.util.*;
public class Q7 {
  public static void main(String[] args) {
	  Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=scan.nextInt();
	System.out.println("Enter the array elements: ");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println("Enter 1 for sorting in ascending order: ");
	System.out.println("Enter 2 for sorting in descending order: ");
	int input=scan.nextInt();
	switch(input)
	{
	case 1:
		ascendingSort(a);
		break;
	case 2:
		descendingSort(a);
		break;
	}
	scan.close();
  }
	static void ascendingSort(int a[])
	{
		Arrays.sort(a);
		 System.out.println("Array after sorting in ascending order: "+Arrays.toString(a));	}
	static void descendingSort(int a[])
	{
       reverse(a);
       System.out.println("Array after sorting in descending order: "+Arrays.toString(a));
	}
	static void reverse(int a[])
	  {
		  int l=0,r=a.length-1;
		  while(l<r)
		  {
			  int temp=a[l];
			  a[l]=a[r];
			  a[r]=temp;
			  l++;
			  r--;
		  }
	  }

}

