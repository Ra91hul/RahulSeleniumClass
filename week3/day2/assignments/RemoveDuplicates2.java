package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {
	
	/**
	 * Declare a string first
	 * split string into a string array with space as delimiter
	 * Declare two Set's two store unique and duplicate values
	 * Iterate over the stringArray and check if string already added then add to dupStringSet
	 * Print it
	 * @param args
	 */

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
//		split it into a array
		String[] stringArray = text.split(" ");

		Set<String> stringSet = new LinkedHashSet<String>();
		Set<String> dupStringSet = new LinkedHashSet<String>();
		for (String string : stringArray) {
			boolean unique = stringSet.add(string);
			if (unique == false)
				dupStringSet.add(string);

		}
		System.out.println("Unique Elements are " + stringSet);
		System.out.println("Duplicate Elements removed are " + dupStringSet);
	}

}
