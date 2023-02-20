package day2;

public class Q_7 {
 int a=5;

	public static void main(String[] args) {
		final Q_7 q=new Q_7();
		q.setValue(10);
		q.printValue();	
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
