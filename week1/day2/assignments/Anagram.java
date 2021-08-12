package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		/*
		 * Declare a string string1 = "stops" Declare another string = "potss" Convert
		 * the strings to char array sort the array check if length of the string are
		 * same compare both array value
		 * 
		 * 
		 * 
		 */
		String string1 = "stops";
		String string2 = "potss";

		if (string1.length() == string2.length()) {

			// convert both string to char
			char[] charArr1 = string1.toCharArray();
			char[] charArr2 = string2.toCharArray();

			// sort the array
			Arrays.sort(charArr1);
			Arrays.sort(charArr2);

			// if sorted chars are same
			// then it is anagram

			boolean result = Arrays.equals(charArr1, charArr2);

			if (result) {
				System.out.println(string1 + " and " + string2 + " are Anagram ");
			} else {
				System.out.println(string1 + " and " + string2 + " are not Anagram ");
			}

		} else {
			System.out.println(string1 + " and " + string2 + " are not Anagram ");

		}
	}

}
