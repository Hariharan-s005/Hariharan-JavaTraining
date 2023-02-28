package eight;

public class SynchronizedStringBuffer extends Thread{
	StringBuffer stringBuffer;
	public SynchronizedStringBuffer(StringBuffer stringBuffer)
	{
		this.stringBuffer=stringBuffer;
	}
	
	/*over rides the run() method in Thread class*/
	public void run()
	{   
		/*creates  a synchronised block and creates an object lock*/
		synchronized(stringBuffer)
		{   
			System.out.println("New Thread");
			for(int i=0;i<100;i++)
			{
				System.out.println(stringBuffer);
			}
			stringBuffer.setCharAt(0, (char)(stringBuffer.charAt(0)+1));   //increments the StringBuffer
		}
	}

}
