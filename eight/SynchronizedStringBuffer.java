package eight;

public class SynchronizedStringBuffer extends Thread{
	StringBuffer stringBuffer;
	public SynchronizedStringBuffer(StringBuffer stringBuffer)
	{
		this.stringBuffer=stringBuffer;
	}
	public void run()
	{
		synchronized(stringBuffer)
		{   
			System.out.println("New Thread");
			for(int i=0;i<100;i++)
			{
				System.out.println(stringBuffer);
			}
			stringBuffer.setCharAt(0, (char)(stringBuffer.charAt(0)+1));
		}
	}

}
