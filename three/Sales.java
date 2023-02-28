package three;
public class Sales 
{
	int itemCount=0;
  synchronized public  void produce()
    {
    	if(itemCount==1)
    	{
    		try
    		{
    			wait();  //causes current thread to wait until another thread invokes notify
    		}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}	
    	}  
    	   
    		System.out.println("Producer produced");
    		itemCount++;
    		System.out.println("Items in inventory:"+itemCount);
    		
    		notify();  //wakes up a single thread which is waiting   	
    }
  synchronized public  void consume()
    {
    	if(itemCount==0)
    	{
    		try
    		{
    			wait();    //causes current thread to wait until another thread invokes notify
    		}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    	}
    		System.out.println("Consumer consumed");
    		itemCount--;
    		System.out.println("Items in inventory:"+itemCount);
    		notify();  //wakes up a single thread which is waiting
    }
 }

