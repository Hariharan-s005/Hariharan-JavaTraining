package day1.seventeen;



public class Test {
	 static int b=10;
public static void main(String[] args) {
	 final int a=5;
		 modify(a);
	 System.out.println(a); // constant members cannot be modified hence the method "modify(int)" is not able to change the value of a
	  Test test=new Test();
	  test.access(b);
	  C c=new C(); //the default constructor is omitted when we create a parametrised constructor, hence it is not possible to instantiate object without parameter
}
static void modify(int a)
{
	a=20;
}
void access(int b)
{
	System.out.println(b);//static members can be accessed in non static methods
}
}
class C
{
	public C(String a) {
	System.out.println("Parametrised constructor called");
	}

}
	

