package strategypattern;

public class Context {
	private ModeOfTransport modeOfTransport;

	   public Context(ModeOfTransport modeOfTransport){
	      this.modeOfTransport = modeOfTransport;
	   }

	   public void executeStrategy(){
	      modeOfTransport.printTime();
	   }
}
