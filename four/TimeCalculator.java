package four;

public class TimeCalculator {
	int second;
	int minute;
	int hour;
	public void currentTime(int second,int minute,int hour)
	{
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}		 
	synchronized public void seconds()  {
		if(second<60) {
		for(int i=second;i<60;i++)
		{	
		try {
			Thread.sleep(1000);
			second++;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());	
		 }
		printClock();
	    }
		notifyAll();
		}
		else {
			try{
		     wait();
		  }
			catch(Exception e){
			  System.out.println(e.getMessage());	 
		     }		
		}
	  }	
	synchronized public void minutes()  {	
		if(second==60&&minute<59) {
		    second=0;
			minute++;
			notifyAll();
		}
		else {
		   try {
		 	 wait();		
		} 
		    catch(Exception e) {
			 System.out.println(e.getMessage());	
		}
		printClock();
	   }		
	 }
		
	synchronized public void hours() {
		if(minute==59) {
			second=0;
			minute=0;	
		if(hour==23)
		{
			hour=0;
		}
		else
		{
			hour++;
		}
			notifyAll();
		}

		else {
		
		try {
			wait();
		} catch (InterruptedException e) {
			
		}
		
	}
  }
	public void printClock() {
		System.out.println("TIME:"+this.hour+":"+this.minute+":"+this.second);
	}
}