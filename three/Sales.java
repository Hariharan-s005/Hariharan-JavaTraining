package three;
public class Sales 
{
	
	boolean flag=true;
	int itemCount=0;
  synchronized public  void produce()
    {
    	if(!flag)
    	{
    		try
    		{
    			wait();
    		}
    		catch(Exception e)
    		{
    			
    		}	
    	}  
    	   
    		System.out.println("Producer produced");
    		itemCount++;
    		System.out.println("Items in inventory:"+itemCount);
    		flag=false;
    		notify();
    	
    }
  synchronized public  void consume()
    {
    	if(flag)
    	{
    		try
    		{
    			wait();
    		}
    		catch(Exception e)
    		{
    			
    		}
    	}
    		System.out.println("Consumer consumed");
    		itemCount--;
    		System.out.println("Items in inventory:"+itemCount);
    		flag=true;
    		notify();
    }
 }

