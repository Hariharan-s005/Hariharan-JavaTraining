package bridgepattern;

//subclass of ModeOfpayment
class Cash implements ModeOfPayment{

	//Overrides travel method of ModeOfPayment
	public void travel(){
		System.out.println(" and paid for the ticket through cash");
	}
}