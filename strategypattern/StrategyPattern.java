/**
 * This program demonstrates Strategy pattern
 *  @author Hariharan Shakthivel 
 */
package strategypattern;

public class StrategyPattern {
 public static void main(String[] args) {
	Context context=new Context(new Cycle());
	context.executeStrategy();
	context=new Context(new TwoWheeler());
	context.executeStrategy();
    context=new Context(new Bus());
	context.executeStrategy();
    context=new Context(new Train());
	context.executeStrategy();
}
}
