package three;


public class ResultObservation2 {
public void mth1()
{
	  mth2();
	  System.out.println("caller");
}
public void mth2()
{
	  try
	  {  
		  throw new Exception();
		  System.exit(0);
	  }
	  catch(Exception e)
	  {
		  System.out.println("catch-mth2");
	  }
	  finally
	  {
		  System.out.println("finally-mth2");
	  }
}
public static void main(String[] args) {
	ResultObservation2 q=new ResultObservation2();
	q.mth1();

}
}
