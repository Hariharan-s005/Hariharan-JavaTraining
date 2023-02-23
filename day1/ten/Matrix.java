package day1.ten;

public class Matrix {
public static void main(String[] args) {
	int a[][]=new int[4][4];
	int k=1;
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			a[i][j]=k++;
		}
	}
	printTwoDimensionalArray(a);
}

 static void printTwoDimensionalArray(int a[][]) { 
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
	}
}
}
