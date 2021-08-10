package week1.day1.assignments;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// Declare your input
		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)
		int number = 153, remainder, calculated = 0, original;

		// Assign input into variable original
		original = number;

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0
		while (number != 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder = number % 10; // 153 % 10 = 3

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			number = number / 10; // 153 / 10 = 15

			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated
			calculated = calculated + (remainder * remainder * remainder);

		}
		// Check whether calculated and original are same
		// When it matches print it as Armstrong number
		if (calculated == original) {
			System.out.println("The given number is arm strong number");
		} else {
			System.out.println("The given number is not arm strong number");

		}

	}

}
