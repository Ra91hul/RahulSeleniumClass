package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		/*
		 * To find the sum of digits of a given number input = 123 output = 6(1+2+3)
		 */

		int i = 123;
		int sum = 0;

		while (i != 0) {
			int remainder = i % 10; // 123%10 = 3
			System.out.println("Remainder is " + remainder);
			sum = remainder + sum; // 3+0
			System.out.println("Sum is " + sum);
			i = i / 10; // 123/10 = 12
				}
		System.out.println("Final Sum is " + sum);

	}

}
