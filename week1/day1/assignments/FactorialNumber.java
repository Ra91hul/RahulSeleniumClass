package week1.day1.assignments;

public class FactorialNumber {

	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input as 5
		int input = 5, fact = 1;
		for (int i = 1; i <= input; i++) {
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
			// the 'fact' variable)
			fact = fact * i;

		}
		System.out.println(fact);
	}

}
