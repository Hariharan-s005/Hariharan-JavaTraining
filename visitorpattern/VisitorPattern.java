/**
 * This program demonstrates Visitor pattern
 *  @author Hariharan Shakthivel 
 */
package visitorpattern;

class VisitorPattern {
	   public static void main(String[] args) {

		   HouseComponents house = new House();
	      house.accept(new HouseComponentsDisplayVisitor());
	   }
	}