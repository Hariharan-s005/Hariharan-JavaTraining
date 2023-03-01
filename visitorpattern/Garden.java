package visitorpattern;

class Garden implements HouseComponents {

	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
		   houseComponentsVisitor.visit(this);
	   }
	}