package visitorpattern;

//class that implements the HouseComponents interface
class House  implements HouseComponents {
	
	HouseComponents[] components;  //an array of type HouseComponents
      
	//constructor which create an array ans stores the subclass types in it
	   public House(){
		   components = new HouseComponents[] {new Furniture(), new ElectricalAppliances(), new Garden()};		
	   } 


	 //method that Overrides the accept method of super class
	   @Override
	   public void accept(HouseComponentsVisitor houseComponentsVisitor) {
	      for (int i = 0; i < components.length; i++) {
	    	  components[i].accept(houseComponentsVisitor);
	      }
	      houseComponentsVisitor.visit(this);
	   }
	}