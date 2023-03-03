package strategypattern;

//class responsible for assigning subclass type
public class Context {
	private ModeOfTransport modeOfTransport;
     
	//constructor that assigns value of modeOfTransport
	   public Context(ModeOfTransport modeOfTransport){
	      this.modeOfTransport = modeOfTransport;
	   }
    //method that calls the printTime method on the modeOfTransport object
	   public void executeStrategy(){
	      modeOfTransport.printTime();
	   }
}
