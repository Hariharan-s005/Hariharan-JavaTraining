
/*An array size is not dynamic hence the only way to resize 
 it is to create a new array and copy the elements of 
 the old old array to the new Array
 */
package day1;
import java.util.*;
public class Q6 {
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the size of the array: ");
	int n= scan.nextInt();
	System.out.println("Enter the array elements: ");
	int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
	}
	System.out.println("Enter the new size of array: ");
	int m=scan.nextInt();
	System.out.println("New array after size change: "+Arrays.toString(resize(a,m)));
	scan.close();
}
  static int[]resize(int a[],int m)
  {   
	  int b[]=new int[m];
	  if(m>a.length) {
	  for(int i=0;i<a.length;i++)
		  b[i]=a[i];
	  }
	  else
	  {
		  for(int i=0;i<m;i++)
			  b[i]=a[i];
	  }
		  
		  
	  return b;
  }
}
