package day2.nine;


public class Visibility {
	public static void main(String[] args) {
			}
}
class A
{
	public int a=5;
	private int b=10;
	protected int c=15;
	
	public void pub()
	{
		System.out.println("Public method");
	}
	private void priv()
	{
		System.out.println("Private method");
	}
	protected void protect()
	{
		System.out.println("Protected method");
	}
}
class B extends A
{
	int a1=a;
	int b1=b;//private member not visible in sub class

	int c1=c;
	A aa=new A();
	aa.pub();
	aa.priv();
	aa.protect();
		
		  
}
