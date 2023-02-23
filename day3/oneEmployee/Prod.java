package day3.oneEmployee;


public  abstract class Prod {
	   abstract void name(String name);
	   abstract void DOJ(String DOJ);
	}
	class Worker extends Prod
	{
	   String name;
	   String DOJ;
	   int salary=15000;
		@Override
		void name(String name) {
			this.name=name;
		}
		@Override
		void DOJ(String DOJ) {
			this.DOJ=DOJ;
		}
		
	}