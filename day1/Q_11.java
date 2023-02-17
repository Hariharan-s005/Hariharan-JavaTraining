package day1;

public class Q_11 {
  public static void main(String[] args) {
	printPattern();
}
  static void printPattern()
  {  int k=1;
      int a[][]=new int[4][4];
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<=i;j++)
			  a[i][j]=k++;
	  }
	  for(int i=0;i<4;i++)
	  {
		  for(int j=0;j<4;j++)
			  if(a[i][j]!=0)
		  System.out.print(a[i][j]+" ");
		  System.out.println();
	  }
  }
}
