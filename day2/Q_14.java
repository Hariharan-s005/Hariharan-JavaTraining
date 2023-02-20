package day2;
import java.util.*;
public class Q_14 {
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Result result=new Result();
    System.out.println("Enter Subject 1s marks:");
    result.subA=scan.nextInt();
    System.out.println("Enter Subject 2s marks:");
    result.subB=scan.nextInt();
    System.out.println("Enter Subject 3s marks:");
    result.subC=scan.nextInt();
    
    System.out.println("Total marks is:"+Result.totalMarks(result.subA, result.subB, result.subC));
   
    scan.close();
    
   }
}

class Student
{
	int name;
	int rollNo;
}
class Exam extends Student
{
	int subA;
	int subB;
	int subC;
}
class Result extends Exam
{
	public static int totalMarks(int subA,int subB,int subC)
	{
		int totalMarks=subA+subB+subC;
		return totalMarks;
	}
}