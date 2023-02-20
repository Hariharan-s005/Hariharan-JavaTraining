//package day2;
//import java.util.*;
//public class Q_3 {
//  public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);	
//	ArrayList<SalesTerritoryManager>salesterritorymanager=new ArrayList<>();
//	ArrayList<SalesManager>salesmanager=new ArrayList<>();
//	ArrayList<SalesPerson>salesPerson=new ArrayList<>();
//	ArrayList<Worker>worker=new ArrayList<>();
//	 System.out.println("Type  Exit to close the application:");
//	  String S=scan.nextLine();
//	while(true) {
//		if(S.equals("Exit"))
//			return;
//		else {
//	System.out.println("Enter type of employee");
//	String type=scan.nextLine();
//	switch(type.toLowerCase())
//	{
//	case "salesterritorymanager":
//		    SalesTerritoryManager stm=new SalesTerritoryManager();
//			System.out.println("Enter name");
//			stm.name(scan.nextLine());
//			System.out.println("Enter DOJ");
//            stm.DOJ(scan.nextLine());
//            salesterritorymanager.add(stm);
//			break;
//	case "salesmanager":
//			SalesManager sm=new SalesManager();
//			System.out.println("Enter name");
//			sm.name(scan.nextLine());
//			System.out.println("Enter DOJ");
//	        sm.DOJ(scan.nextLine());
//	        salesterritorymanager.add(sm);
//			break;
//	case "salesperson":
//		    SalesPerson sp=new SalesPerson();	
//		    System.out.println("Enter name");
//			sp.name(scan.nextLine());
//			System.out.println("Enter DOJ");
//		    sp.DOJ(scan.nextLine());
//		    salesPerson.add(sp);
//		    break;
//	case "worker":
//		    Worker wk=new Worker();
//		    System.out.println("Enter name");
//			wk.name(scan.nextLine());
//			System.out.println("Enter DOJ");
//		    wk.DOJ(scan.nextLine());
//		    worker.add(wk);
//            break;
//    default:
//    	System.out.println("Enter correct employee role");
//    	break;
//
//
//   }
//}
//  }
//}
//}
//abstract class Employee
//{
//	abstract void name(String name);
//	abstract int salary();
//	abstract void DOJ(String DOJ);
//}
//
//class SalesTerritoryManager extends Employee
//{
//
//	@Override
//	void name(String name) {
//		System.out.println(name);		
//	}
//
//	@Override
//	int salary() {
//		return 50000;
//	}
//
//	@Override
//	void DOJ(String DOJ) {
//		System.out.println(DOJ);		
//	}
//	
//}
//class SalesManager  extends SalesTerritoryManager
//{
//	void name(String name)
//	{
//		System.out.println(name);		
//	}
//	int salary() {
//		return 35000;
//	}
//	void DOJ(String DOJ) {
//		System.out.println(DOJ);		
//	}
//
//
//}
//class SalesPerson extends SalesManager
//{
//	void name(String name)
//	{
//		System.out.println(name);		
//	}
//	int salary() {
//		return 20000;
//	}
//	void DOJ(String DOJ) {
//		System.out.println(DOJ);		
//	}
//
//
//}
//class Worker extends Employee
//{
//
//	@Override
//	void name(String name) {
//		System.out.println(name);		
//		
//	}
//
//	@Override
//	int salary() {
//		return 15000;
//	}
//
//	@Override
//	void DOJ(String DOJ) {
//		System.out.println(DOJ);
//		
//	}
//	
//}