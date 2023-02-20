package day2;

public class Q_10 {
  C c=new C();
}
class A
{
	A()
	{
		System.out.println("Class A");
	}
}
class B
{
	B()
	{
		System.out.println("Class B");
	}
}
class C  extends A
{
	B b=new B();
}
