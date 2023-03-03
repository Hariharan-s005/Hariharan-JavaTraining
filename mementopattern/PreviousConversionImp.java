package mementopattern;

public class PreviousConversionImp implements PreviousConversionToCaretaker,PreviousConversionToOriginator {
  private double miles;
  public PreviousConversionImp(double mile)
  {
	  this.miles=mile;
  }
  @Override
	public double getMiles() {
		
		return miles;
	}

}
