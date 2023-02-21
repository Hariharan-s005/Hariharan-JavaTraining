package day3_Employee;
abstract class Sales
{
	abstract void name(String name);
	abstract void DOJ(String DOJ);
}

class SalesTerritoryManager extends Sales
{
    String name;
    String DOJ;
    int salary=50000;
	@Override
	void name(String name) {
		this.name=name;
	}

	@Override
	void DOJ(String DOJ) {
		this.DOJ=DOJ;
	}
	
}
class SalesManager  extends SalesTerritoryManager
{   
	int salary=35000;
	void name(String name) {
		this.name=name;
	}
	
	void DOJ(String DOJ) {
		this.DOJ=DOJ;
	}


}
class SalesPerson extends SalesManager
{   
	int salary=20000;
	void name(String name) {
		this.name=name;
	}
	
	void DOJ(String DOJ) {
		this.DOJ=DOJ;
	}


}
