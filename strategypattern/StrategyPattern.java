/**
 * This program demonstrates Strategy pattern
 *  @author Hariharan Shakthivel 
 */
package strategypattern;

public class StrategyPattern {
 public static void main(String[] args) {
	Context context=new Context(new Cycle()); //creates context class object of subclass Cycle
	context.executeStrategy();                //calls executeStrategy method
	context=new Context(new TwoWheeler());    //creates context class object of subclass TwoWheeler
	context.executeStrategy();                //calls executeStrategy method
    context=new Context(new Bus());           //creates context class object of subclass Bus
	context.executeStrategy();                //calls executeStrategy method
    context=new Context(new Train());         //creates context class object of subclass Train
	context.executeStrategy();                //calls executeStrategy method
}
}
