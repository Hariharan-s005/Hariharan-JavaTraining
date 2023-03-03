package mementopattern;


//Implementation class for UnitConvertor
public class UnitConvertorImp implements UnitConvertor {
  private double miles;
    
	@Override
	public PreviousConversionToCaretaker backupLastResult() {
		
		return new PreviousConversionImp(miles);
	}
	
	//method which restores previous conversion value
	@Override
	public void restorePreviousConversion(PreviousConversionToCaretaker memento) {
		 this.miles=((PreviousConversionToOriginator)memento).getMiles();		   
	}
   
	//method that returns ConversionResult
	@Override
	public double getConversionResult() {
		// TODO Auto-generated method stub
		    return miles*1.602;
	}
    
	//method that sets miles
	@Override
	public void setMiles(double miles) {
		this.miles=miles;		
	}

}
