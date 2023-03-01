package visitorpattern;

class House  implements HouseComponents {
	
	HouseComponents[] components;

	   public House(){
		   components = new HouseComponents[] {new Furniture(), new ElectricalAppliances(), new Garden()};		
	   } 


	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
	      for (int i = 0; i < components.length; i++) {
	    	  components[i].accept(houseComponentsVisitor);
	      }
	      houseComponentsVisitor.visit(this);
	   }
	}