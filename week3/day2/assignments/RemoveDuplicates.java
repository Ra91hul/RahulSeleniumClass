package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	/**
	 * Declare a String as " PayPal India " Convert it into a character array
	 * Declare a SET as charSet for Character Declare a SET as dupCharSet for
	 * Character Iterate character array and add it to charSet if Character is
	 * already in the character set then, add it to the dup charSet Iterate using
	 * charSET Check the iterator variable isn't equals to an empty space print it
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		String str = "PayPal India";
		String str1 = str.toLowerCase();
		String str2 = str1.replaceAll("\\s", "");

		char[] charArray = str2.toCharArray();// {p,a,y,p,a,l,i,n,d,i,a}

		Set<Character> charList = new LinkedHashSet<Character>();
		Set<Character> dupCharList = new LinkedHashSet<Character>();

		for (Character c : charArray) {
			boolean unique = charList.add(c);
			if (unique == false)
				dupCharList.add(c);

		}
		System.out.println("Duplicate Characters are : " + dupCharList);
		charList.removeAll(dupCharList);
		System.out.println("The Character Set after removing Duplicates : " + charList);

	}
}
