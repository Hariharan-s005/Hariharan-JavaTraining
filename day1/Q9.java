package day1;
import java.util.*;
public class Q9 {
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	reverse(a);
	System.out.println(Arrays.toString(a));
	scan.close();
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
