package week1.day1.assignments;

public class FibonnaciSeries {

	/*
	 * To find a Fibonnaci series for a given range input : 8 output :
	 * 0,1,1,2,3,5,8,13
	 */
	public static void main(String[] args) {
		// initialize 3 int variables
		int range = 8, firstNum = 0, secNum = 1, sumInTheSeries;

		// Print First number
		System.out.println(firstNum);
		System.out.println(secNum);

		for (int i = 2; i < range; i++) {

			// Add First and Second Number and assign it to sum in the series
			sumInTheSeries = firstNum + secNum; // 0 + 1 = 1

			// Assign second number to first number
			firstNum = secNum;

			// Assign sum to second number
			secNum = sumInTheSeries;

			System.out.println(sumInTheSeries);

		}
	}
}
