/**
 * This program shows that a thread once started can never be started again.
 *  @author Hariharan Shakthivel 
 */ 
package five;
public class ThreadExecution {
    public static void main(String[] args) {
		Thread thread=new Thread();
		thread.start();
		thread.start();     //Illegal Thread State Exception
		
	}
}
