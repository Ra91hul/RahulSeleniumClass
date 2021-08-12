package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		/*
		 * Declare and initialize a string = "$$ Welcome to 2nd class of automation $$ "
		 * To find count of data types letter,space,digit,special character declare as
		 * int letter = 0, digit = 0,space=0,special character=0 Convert string into a
		 * array using toCharArray() Traverse through each character in the array find
		 * the array char is what type
		 * Chracter.isLetter(),Character.isDigit(),Character.isSpaceChar else consider
		 * as special character
		 * 
		 * print the count as system.out.println("Letter is " + letter);
		 * system.out.println("Space is " + space character);
		 * system.out.println("digit is " + digit);
		 * system.out.println("special character is " + specCharacter);
		 */

		String str1 = "$$ Welcome to 2nd class of automation $$ ";
		int letter = 0, digit = 0, space = 0, spclChar = 0;

		char[] charArr = str1.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if (Character.isLetter(charArr[i])) {
				letter++;
			} else if (Character.isDigit(charArr[i])) {
				digit++;
			} else if (Character.isSpaceChar(charArr[i])) {
				space++;
			} else {
				spclChar++;
			}
		}
		System.out.println("Letter is " + letter);
		System.out.println("Digit is " + digit);
		System.out.println("Space is " + space);
		System.out.println("Special Character is " + spclChar);
	}

}
