package bridgepattern;

//subclass of ModeOfTransport
class Train extends ModeOfTransport{

	public Train(ModeOfPayment modeOfPayment) {
		super(modeOfPayment);   //calls parent class constructor
	}

	//Overrides travel method of ModeOfTransport
	@Override
	public void travel() {
		System.out.print("Traveled in Train");
		modeOfPayment.travel();
	} 

}