package day2.sixteen;


public class ErrorRectification{
	  public static void main(String[] args) {
		X x1=new X();
		X x2=new Y();
		Y y1=new Y();
		x2.do1();
	}
	}
	class X
	  {
		  void do1()
		  {
			  
		  }
	  }
	class Y extends X

	{
	  void do2()
	  {
		  
	  }
	}
