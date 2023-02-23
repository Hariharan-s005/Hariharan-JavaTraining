package day3.four;

public class InterfaceAndClass {
   public static void main(String[] args) {
	Five five=new Five();
	five.classMethod1(five);
	five.classMethod2(five);
	five.classMethod3(five);
	five.classMethod4(five);
	five.methodOne();
	five.methodTwo();
	five.methodThree();
	
}
}
interface One
{
	void methodOne();
	void methodTwo();
}
interface Two
{
	void methodOne();
	void methodTwo();

}
interface Three
{
	void methodOne();
	void methodTwo();

}
interface Four extends One,Two,Three
{
	void methodThree();
}
class Five implements Four
{
	
	
	void classMethod1(One one)
	{
		System.out.println("Value passed");
	}
	void classMethod2(Two two)
	{
		System.out.println("Value passed");

	}
	void classMethod3(Three three)
	{
		System.out.println("Value passed");

	}
	void classMethod4(Four four)
	{
		System.out.println("Value passed");

	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("Method One");
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
	   System.out.println("Method Two");
	}
	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("Method Three");
	}
	
	

}