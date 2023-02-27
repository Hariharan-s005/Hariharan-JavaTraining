package eight;

public class Main {
 public static void main(String[] args) {
	StringBuffer stringBuffer=new StringBuffer("A");
	SynchronizedStringBuffer synchronizedStringBuffer1=new SynchronizedStringBuffer(stringBuffer);
	SynchronizedStringBuffer synchronizedStringBuffer2=new SynchronizedStringBuffer(stringBuffer);
	SynchronizedStringBuffer synchronizedStringBuffer3=new SynchronizedStringBuffer(stringBuffer);
	
	synchronizedStringBuffer1.start();
	synchronizedStringBuffer2.start();
	synchronizedStringBuffer3.start();
	
}
}
