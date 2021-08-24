package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicateValues {

	/**
	 * This method shows adding the integers from an array to a list using
	 * Arrays.asList(arr1) For this, the data type should be of non primitive data
	 * type (wrapper class) ie. Integer arr[] = {} instead of inr arr[] ={}
	 * 
	 * it can be added using addAll() method or by directly passing to the
	 * constructor
	 */

	public static void main(String[] args) {
		Integer arr[] = { 3, 4, 5, 2, 2 };
		Integer arr1[] = { 4, 2, 1, 4 };

		// mthd1 : to add using addAll()
		List<Integer> intList = new ArrayList<Integer>();
		intList.addAll(Arrays.asList(arr));

		// mthd2 : to add by directly passing to the constructor
		List<Integer> intList1 = new ArrayList<Integer>(Arrays.asList(arr1));

		// 2.print the duplicates from arr1[]
		intList1.retainAll(intList);
		System.out.println("Duplicate elements in arr1[] : " + intList1);

	}

}
