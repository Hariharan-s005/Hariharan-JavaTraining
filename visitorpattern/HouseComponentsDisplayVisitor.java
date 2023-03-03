package visitorpattern;

//Visitor class which implements the HouseComponentsVisitor interface
class HouseComponentsDisplayVisitor implements HouseComponentsVisitor {
  
	//overrides Override method of HouseComponentsVisitor
	   @Override
	   public void visit(ElectricalAppliances ElectricalAppliances) {
	      System.out.println("Electrical appliances");
	   }
	 //overrides Override method of HouseComponentsVisitor
	   @Override
	   public void visit(Garden Garden) {
	      System.out.println("Garden");
	   }
	 //overrides Override method of HouseComponentsVisitor
	   @Override
	   public void visit(Furniture Furniture) {
	      System.out.println("Furniture");
	   }
	 //overrides Override method of HouseComponentsVisitor
	   @Override
	   public void visit(House House) {
	      System.out.println("House");
	   }
	}