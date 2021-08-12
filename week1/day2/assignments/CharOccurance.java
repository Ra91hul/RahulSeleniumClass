package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		/*
		 * Pseudo code Input string = "Welcome to Chennai" declare and initialize count
		 * as 0 convert string to char traverse from 0 till array length check the char
		 * array has the particular char in it if it has increment the count print the
		 * count out of the loop
		 */

		String str1 = "Welcome to Chennai";
		int count = 0;
		char charOcc = 'e';
		char[] charArr = str1.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == charOcc) {
				count++;

			}

		}
		System.out.println("No. of times " + "'" + charOcc + "'" + " occured in a string is " + count);
	}

}
