package seven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Count {
   public static void main(String[] args) {
	ExecutorService executorService=Executors.newFixedThreadPool(1);
	Counter counter=new Counter();
	executorService.execute(()->{
		System.out.println("**********Count till 100**********");
		counter.printCount();
	});
	executorService.shutdown();
}
}
