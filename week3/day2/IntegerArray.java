package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class IntegerArray {
	
	/**
	 * This method shows adding the integers from an array to a list
	 * using a normal for loop. The data set is maintained as primitive data type (int)
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 5, 2, 2, 1 };
		int arr2[] = { 6, 2, 1, 8 };

		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			intList.add(arr[i]);

		}
		for (int j = 0; j < arr2.length; j++) {
			intList1.add(arr2[j]);

		}

		// Print the Duplicate elements in arr
		// intList.retainAll(intList1);
		// System.out.println("Duplicate elements in arr[] : " + intList);

		// Print the unique elements in arr
		// intList.removeAll(intList1);
		// System.out.println("Unique Limit in arr[]: " + intList);

		// Remove number from the arr
		intList.remove(2);
		System.out.println("Number 5 removed from the arr[] " + intList);

	}

}
