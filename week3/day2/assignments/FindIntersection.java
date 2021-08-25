package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	/**
	 * Psuedo code
	 * 
	 * Declare An array for {3,2,11,4,6,7}; Declare another array for {1,2,8,4,9,7};
	 * Declare a two list
	 * iverate over the array to add elements to the list
	 * Compare both the list and retain common elements and print it
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> intgList1 = new ArrayList<Integer>();
		List<Integer> intgList2 = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			intgList1.add(arr1[i]);

		}

		for (int j = 0; j < arr2.length; j++) {
			intgList2.add(arr2[j]);

		}

		System.out.println(" First Integer List elements are " + intgList1);
		System.out.println("Second Integer List elements are " + intgList2);
		
		intgList1.retainAll(intgList2);
		System.out.println("The intersection between 2 arrays are : " + intgList1);

	}

}
