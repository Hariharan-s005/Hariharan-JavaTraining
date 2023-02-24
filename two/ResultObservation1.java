package two;


public class ResultObservation1 {
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
			  return;
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
		  ResultObservation1 resultObservation=new ResultObservation1();
		  resultObservation.mth1();

	}
	}
