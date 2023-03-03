package visitorpattern;

//class that implements the HouseComponents interface
class Furniture implements HouseComponents {

	//method that Overrides the accept method of super class
	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
		   houseComponentsVisitor.visit(this);
	   }
	}
