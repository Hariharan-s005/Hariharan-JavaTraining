package five;
public class ThreadExecution {
    public static void main(String[] args) {
		Thread thread=new Thread();
		thread.start();
		thread.start();     //Illegal Thread State Exception
		
	}
}
