package day2;
import java.util.*;
public class Q_12 {
	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   Wipro wipro =new Wipro();
	   Wipro w1=new Wipro();
	   Wipro w2=new WiproTechnologies();
	   Wipro w3=new WiproInfotech();
	   Wipro w4=new WiproBPO();
	  	   Wipro w[]=new Wipro[4];
	   w[0]=w1;
	   w[1]=w2;
	   w[2]=w3;
	   w[3]=w4;
	   
	   w[0].empDivision();
	   w[0].empSalary();
	   
	   w[1].empDivision();
	   w[1].empSalary();

	   w[2].empDivision();
	   w[2].empSalary();

	   w[3].empDivision();
	   w[3].empSalary();

	   scan.close();
	 	   
	}
}
class Wipro
{
	public void empDivision()
	{
		System.out.println("An employee of Wipro");
	}
	public void empSalary()
	{
		System.out.println("Salary as per Industry norms");
	}
}
class WiproTechnologies extends Wipro
{  
	@Override
	public  void empDivision()
	{
		System.out.println("An employee of Wiprotechnologies");
	}
	@Override
	public void empSalary()
	{
		System.out.println("Salary between 3 lpa and 7 lpa");
	}

}
class WiproInfotech extends Wipro
{
	public void empDivision()
	{
		System.out.println("An employee of WiproInfotech");
	}
	public void empSalary()
	{
		System.out.println("Salary between 5 lpa and 15 lpa");
	}


}
class WiproBPO extends Wipro
{
	public void empDivision()
	{
		System.out.println("An employee of WiproBPO");
	}
	public void empSalary()
	{
		System.out.println("Salary of 6 lpa");
	}

}

