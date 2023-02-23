package day2.eleven;



public class ConstructorBehaviourWithArguments {
	  public static void main(String[] args) {
		C c=new C();
		
	}
	}
	class A
	{
		public A(String a)
		{
			System.out.println(a);
		}
	}
	class B
	{
		public B(String b)
		{
			System.out.println(b);
		}
	}
	class C  extends A
	{   
		
		public C()
		{
			A a=new A("A class initialised");
			B b=new B("B class initialised");
		}
	}
