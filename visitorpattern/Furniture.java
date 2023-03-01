package visitorpattern;

class Furniture implements HouseComponents {

	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
		   houseComponentsVisitor.visit(this);
	   }
	}
