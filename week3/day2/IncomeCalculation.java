package week3.day2;

public interface IncomeCalculation {
	
	// The variable in an interface is public, static, and final by default.
	
	//private int a = 30;
	
	int check = 5000;
	/**
	 * 
	 * @param name
	 * @param income1
	 * @param income2
	 * @return
	 */
	public double calcNetIncome(String name, double income1, double income2);

}
