/**
 * This program follows the steps given in the question to demonstrate object lock
 *  @author Hariharan Shakthivel 
 */
package eight;

public class StringBufferLock {
 public static void main(String[] args) {
	StringBuffer stringBuffer=new StringBuffer("A");  //creates a String Buffer 'A'.
	SynchronizedStringBuffer synchronizedStringBuffer1=new SynchronizedStringBuffer(stringBuffer);
	SynchronizedStringBuffer synchronizedStringBuffer2=new SynchronizedStringBuffer(stringBuffer);
	SynchronizedStringBuffer synchronizedStringBuffer3=new SynchronizedStringBuffer(stringBuffer);
	
	synchronizedStringBuffer1.start();    //starts the thread
	synchronizedStringBuffer2.start();    //starts the thread
	synchronizedStringBuffer3.start();    //starts the thread
	
}
}
