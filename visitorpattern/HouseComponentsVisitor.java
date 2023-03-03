package visitorpattern;

//interface HouseComponensVisitor
interface HouseComponentsVisitor {
	public void visit(House House);
	public void visit(ElectricalAppliances ElectricalAppliances);
	public void visit(Garden Garden);
	public void visit(Furniture Furniture);
}