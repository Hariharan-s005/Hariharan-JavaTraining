package visitorpattern;

class HouseComponentsDisplayVisitor implements HouseComponentsVisitor {

	   @Override
	   public void visit(ElectricalAppliances ElectricalAppliances) {
	      System.out.println("Electrical appliances");
	   }

	   @Override
	   public void visit(Garden Garden) {
	      System.out.println("Garden");
	   }

	   @Override
	   public void visit(Furniture Furniture) {
	      System.out.println("Furniture");
	   }
	   @Override
	   public void visit(House House) {
	      System.out.println("House");
	   }
	}