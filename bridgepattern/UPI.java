package bridgepattern;

//subclass of modeOfPayment
class UPI implements ModeOfPayment{
    
	//Overrides travel method of parent class
	public void travel(){
		System.out.println(" and paid for the ticket using UPI");
	}
}
