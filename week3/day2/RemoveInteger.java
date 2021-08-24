package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class RemoveInteger {

	/**
	 * This is to remove an integer value from the list Use Integer.valueOf() to get
	 * the desired result
	 */

	public static void main(String[] args) {
		int arr[] = { 3, 4, 5, 2, 2 };
		List<Integer> intList = new ArrayList<Integer>();

		for (int j = 0; j < arr.length; j++) {
			intList.add(arr[j]);
		}

		/*
		 * To remove the element 4 from the list Below does not work out because the
		 * remove() accepts the index(which is an integer) So, the below command removes
		 * the element that is in the index-4 This removes 2 which is in the 4th index
		 */

		intList.remove(4);
		System.out.println(intList); // observe the output carefully

		/*
		 * To remove the element 4 from the list Use Integer.valueOf()
		 * 
		 */

		intList.remove(Integer.valueOf(4));
		System.out.println(intList);

	}

}
