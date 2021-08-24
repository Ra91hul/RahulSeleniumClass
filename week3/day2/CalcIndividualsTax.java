package week3.day2;

public class CalcIndividualsTax implements TaxCalculation,IncomeCalculation{

	public double calcNetIncome(String name, double income1, double income2) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(income1+income2);
		return 0;
	}

	public void calcDeductions(String name, double HRA, double LTA) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(HRA+LTA);
	}

	public void calcGrossIncome(String name, double netIncome, double deductions) {
		// TODO Auto-generated method stub
		
	}

	public int taxSlab() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double CalcTaxandPublishValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void toDisplay2(){
		System.out.println("This is CalcIndividualsTax own method");
	}

}
