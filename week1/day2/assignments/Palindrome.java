package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {

		/*
		 * Psuedo Code 
		 * Declare a string = "Madam" 
		 * declare a variable to store reverse of
		 * original string 
		 * convert string to an array 
		 * traverse through the array String
		 * array in reverse index and store values in reverse variable 
		 * Compare reverse string is equals to original
		 * if yes, Display as String is Palindrome. Otherwise, String is not a Plaindrome
		 */

		String orgString = "madam";
		String revString = "";
		char[] charArray = orgString.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			revString = revString + charArray[i];

		}
		System.out.println("Original String is : " + orgString);
		System.out.println("Reverse String is : " + revString);

		if (orgString.equalsIgnoreCase(revString))
			System.out.println("String is a Plaindrome");
		else
			System.out.println("String is not a Palindrome");

	}
}