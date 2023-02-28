/**
 * This program formats a message as per the manner given in the question.
 *  @author Hariharan Shakthivel 
 */ 
package two;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Message {
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newFixedThreadPool(1);        //Creates a thread pool that reuses a fixed number of threads.
		String message="[----------------------------------Printing the message as per the format----------------------------------- ]";
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
			PrintMessage.displayMessage(message,90,110);
		});
		executorService.shutdown();
		
	}
}
class PrintMessage
{
	synchronized static void displayMessage(String message,int startIndex,int endIndex)
	{
		
		System.out.print(message.substring(startIndex, endIndex));   //prints the substring between particular indices.
	}
}
