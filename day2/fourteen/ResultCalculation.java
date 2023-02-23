package day2.fourteen;

import java.util.Scanner;

public class ResultCalculation{
	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Student name");
    String name=scan.nextLine();
    System.out.println("Enter Student roll no:");
    int rollNo=scan.nextInt();
    System.out.println("Enter Subject 1s marks:");
    int a= scan.nextInt();
    System.out.println("Enter Subject 2s marks:");
   int b=scan.nextInt();
    System.out.println("Enter Subject 3s marks:");
    int c=scan.nextInt();
    Result result=new Result(name,rollNo,a,b,c);
    System.out.println("Total marks of:"+result.name+" (Roll number: "+result.rollNo+ ") is "+result.totalMarks(result.subA, result.subB, result.subC));
   
    scan.close();
    
   }
}

class Student
{   String name;
		int rollNo;
	Student(String  name,int rollNo)
	{
		this.name=name;
		this.rollNo=rollNo;
	}

    }
class Exam extends Student
{   
	int subA;
	int subB;
	int subC;

	Exam(String name,int rollNo,int subA, int subB, int subC)
	{   super(name,rollNo);
		this.subA=subA;
		this.subB=subB;
		this.subC=subC;	
	}
		   
}
class Result extends Exam
{
	Result(String name,int rollNo,int subA, int subB, int subC) {
		super(name,rollNo,subA,subB,subC);
	}
	public  int totalMarks(int subA,int subB,int subC)
	{
		int totalMarks=subA+subB+subC;
		return totalMarks;
	}
}