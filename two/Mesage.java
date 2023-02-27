package two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mesage {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		String message="[----------------------------------Printing the message using different threads----------------------------------- ]";
		executorService.execute(()->{
			PrintMessage.displayMessage(message,0,18);
		});
		executorService.execute(()->{
			PrintMessage.displayMessage(message,18,34);
		});
		executorService.execute(()->{
			PrintMessage.displayMessage(message,34,50);
		});
		executorService.execute(()->{
			PrintMessage.displayMessage(message,50,90);
		});
		executorService.execute(()->{
			PrintMessage.displayMessage(message,90,116);
		});
		executorService.shutdown();
		
	}
}
class PrintMessage
{
	synchronized static void displayMessage(String message,int startIndex,int endIndex)
	{
		
		System.out.print(message.substring(startIndex, endIndex));
	}
}
