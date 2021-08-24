package week3.day2;

public interface TaxCalculation {
	
	/**
	 * 
	 * @param name
	 * @param HRA
	 * @param LTA
	 */
	void calcDeductions(String name, double HRA, double LTA);
	
	/**
	 * 
	 * @param name
	 * @param netIncome
	 * @param deductions
	 */
	void calcGrossIncome(String name, double netIncome, double deductions);
	
	/**
	 * 
	 * @return
	 */
	public int taxSlab();
	
	/**
	 * 
	 * @return
	 */
	public double CalcTaxandPublishValue();
	

}
