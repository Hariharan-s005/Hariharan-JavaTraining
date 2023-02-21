package day3_Employee;

import java.util.ArrayList;
import java.util.Scanner;
class Runner {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	ArrayList<SalesTerritoryManager>salesterritorymanager=new ArrayList<>();
	ArrayList<SalesManager>salesmanager=new ArrayList<>();
	ArrayList<SalesPerson>salesperson=new ArrayList<>();
	ArrayList<Worker>worker=new ArrayList<>();
	String input="Y";
	while(input.equals("Y")) {
	System.out.println("Enter type of employee");
	String type=scan.nextLine();
	switch(type.toLowerCase())
	{
	case "salesterritorymanager":
		    SalesTerritoryManager stm=new SalesTerritoryManager();
		    System.out.println("Enter total number: ");
		    int n=scan.nextInt();
		    scan.nextLine();
		    for(int i=0;i<n;i++) {
			System.out.println("Enter name");
			stm.name(scan.nextLine());
			System.out.println("Enter DOJ");
            stm.DOJ(scan.nextLine());
            salesterritorymanager.add(stm);
		    }
			break;
	case "salesmanager":
			SalesManager sm=new SalesManager();
			System.out.println("Enter total number: ");
		    n=scan.nextInt();
		    scan.nextLine();
		    for(int i=0;i<n;i++) {
			System.out.println("Enter name");
			sm.name(scan.nextLine());
			System.out.println("Enter DOJ");
	        sm.DOJ(scan.nextLine());
	        salesmanager.add(sm);
		    }
			break;
	case "salesperson":
		    SalesPerson sp=new SalesPerson();
		    System.out.println("Enter total number: ");
		    n=scan.nextInt();
		    scan.nextLine();
		    for(int i=0;i<n;i++) {
		    System.out.println("Enter name");
			sp.name(scan.nextLine());
			System.out.println("Enter DOJ");
		    sp.DOJ(scan.nextLine());
		    salesperson.add(sp);
		    }
		    break;
	case "worker":
		    Worker wk=new Worker();
		    System.out.println("Enter total number: ");
		    n=scan.nextInt();
		    scan.nextLine();
		    for(int i=0;i<n;i++) {
		    System.out.println("Enter name");
			wk.name(scan.nextLine());
			System.out.println("Enter DOJ");
		    wk.DOJ(scan.nextLine());
		    worker.add(wk);
		    }
            break;
    default:
    	System.out.println("Enter correct employee role");
    	break;

       }
	System.out.println("Continue:Y/N");
    input=scan.nextLine();
    
}
	System.out.println("Employees data:");
	if(!(salesterritorymanager.size()==0))
	{
	System.out.println("***SalesTerritoryManager***");
				System.out.println();
	for(int i=0;i<salesterritorymanager.size();i++)
	{
		System.out.println("Name: "+salesterritorymanager.get(i).name);
		System.out.println("Salary: "+salesterritorymanager.get(i).salary);
		System.out.println("DOJ: "+salesterritorymanager.get(i).DOJ);
	}
	}
    System.out.println();
    if(!(salesmanager.size()==0))
	{
    System.out.println("***SalesManager***");
    	for(int i=0;i<salesmanager.size();i++)
	{
		System.out.println("Name: "+salesmanager.get(i).name);
		System.out.println("Salary: "+salesmanager.get(i).salary);
		System.out.println("DOJ: "+salesmanager.get(i).DOJ);
	}
	}
	System.out.println();
	  if(!(salesperson.size()==0))
		{
	System.out.println("***SalesPerson***");
	for(int i=0;i<salesperson.size();i++)
	{
		System.out.println("Name: "+salesperson.get(i).name);
		System.out.println("Salary: "+salesperson.get(i).salary);
		System.out.println("DOJ: "+salesperson.get(i).DOJ);
	}
	}
	System.out.println();
	  if(!(worker.size()==0))
		{
	System.out.println("***Worker***");
	for(int i=0;i<worker.size();i++)
	{
		System.out.println("Name: "+worker.get(i).name);
		System.out.println("Salary: "+worker.get(i).salary);
		System.out.println("DOJ: "+worker.get(i).DOJ);
	}

		}
	  scan.close();
	}
  

}
