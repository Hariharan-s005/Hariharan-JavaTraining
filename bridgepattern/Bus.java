package bridgepattern;

//subclass of ModeOfTransport
class Bus extends ModeOfTransport{

	public Bus(ModeOfPayment modeOfPayment) {
		super(modeOfPayment);  //calls parent constructor of ModeOfTransport
	}
  
	//Overrides travel method of ModeOfTransport
	@Override
	public void travel() {
		System.out.print("Travelled in Bus");
		modeOfPayment.travel();
	} 

}