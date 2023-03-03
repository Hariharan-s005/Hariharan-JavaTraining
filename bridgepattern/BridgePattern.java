/**
 * This program demonstrates bridge pattern
 *  @author Hariharan Shakthivel 
 */
package bridgepattern;

public class BridgePattern {
		public static void main(String[] args) {
			
			ModeOfTransport train = new Train(new UPI());    //creates object of subclass of ModeOfTransport Train, with ModeOfpayment subclass UPI as the constructor parameter.
			train.travel();    //calls travel method
			
			ModeOfTransport bus = new Bus(new Cash());       //creates object of subclass of ModeOfTransport Bus, with ModeOfpayment subclass Cash as the constructor parameter.
			bus.travel();     //calls travel method
		}
	}






