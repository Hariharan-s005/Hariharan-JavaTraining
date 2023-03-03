package visitorpattern;

class Garden implements HouseComponents {

	//method that Overrides the accept method of super class
	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
		   houseComponentsVisitor.visit(this);
	   }
	}