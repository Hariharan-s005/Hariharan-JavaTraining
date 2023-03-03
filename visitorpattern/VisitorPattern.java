/**
 * This program demonstrates Visitor pattern
 *  @author Hariharan Shakthivel 
 */
package visitorpattern;

class VisitorPattern {
	   public static void main(String[] args) {

		   HouseComponents house = new House();  //creates object for house
	      house.accept(new HouseComponentsDisplayVisitor());  //calls accept method on the house object
	   }
	}