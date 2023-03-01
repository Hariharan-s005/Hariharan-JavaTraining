package visitorpattern;

class ElectricalAppliances implements HouseComponents {

	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
		   houseComponentsVisitor.visit(this);
	   }
	}