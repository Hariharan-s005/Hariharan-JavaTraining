package mementopattern;


//Interface for UnitConvertor
public interface UnitConvertor {
	
	  //Create Memento 
	 public PreviousConversionToCaretaker backupLastResult();
		
		// setMemento
	public void restorePreviousConversion(PreviousConversionToCaretaker memento);
	
		
		public double getConversionResult();
		public void setMiles(double miles);
		
}


