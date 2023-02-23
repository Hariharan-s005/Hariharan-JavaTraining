package day2.seven;


public class ChangeState {
	 int a=5;

		public static void main(String[] args) {
			final ChangeState changeState=new ChangeState();
			changeState.setValue(10);
			changeState.printValue();	
		}
	    void setValue(int x)
	    {
	    	a=x;
	    }
	    void printValue()
	    {
	    	System.out.println(a);
	    }
	}
