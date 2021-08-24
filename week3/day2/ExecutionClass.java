package week3.day2;

public class ExecutionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cannot create object for an interface class
		// IncomeCalculation calc = new IncomeCalculation();

		// Object Instantiation for the Implemented Class : CalcBusinessTax
		CalcBusinessTax busTax = new CalcBusinessTax();

		// Object Instantiation for the Implemented Class : CalcIndividualsTax
		CalcIndividualsTax indvTax = new CalcIndividualsTax();

		// Calling Methods from the implementation class
		busTax.calcDeductions("Rahul", 100, 200);
		busTax.calcNetIncome("Sachin", 300, 500);
		indvTax.calcDeductions("Farhan", 400, 500);
		indvTax.calcNetIncome("Priya", 600, 800);
		busTax.toDisplay();
		indvTax.toDisplay2();

		// Inherited InheritClass CalcBusinessTax and calling its methods
		busTax.toShowInherit();

	}

}
