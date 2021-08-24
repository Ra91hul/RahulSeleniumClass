package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollections {

	/**
	 * Declare a string
	 * Convert array to a list
	 * sort the list using Collections.sort
	 * iterate over the array in reverse order and display the result
	 */
	
	public static void main(String[] args) {
		String[] str = { "Aspire Systems", "CTS", "Wipro", "HCL" };

		List<String> list = new ArrayList<String>(Arrays.asList(str));
		Collections.sort(list);

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(list.get(i));
			System.out.print(" ");

		}

	}

}
