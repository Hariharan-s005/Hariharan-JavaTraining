package bridgepattern;


//abstract class for mode of payment
abstract class ModeOfTransport {
	
	protected ModeOfPayment modeOfPayment;
	
	//constructor takes ModeOfPayment object as parameter and assigns its value
	public ModeOfTransport(ModeOfPayment modeOfPayment){     
		this.modeOfPayment=modeOfPayment;
	}
	
	abstract public void travel();
}