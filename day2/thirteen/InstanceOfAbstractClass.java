package day2.thirteen;


public class InstanceOfAbstractClass {
	 Test test=new Test(); //Error: unable to instantiate class
	 
	}

	abstract class Test
	{
		public static void print()
		{
			System.out.println("Abstract class 'print' method");
		}
	}