package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);

		List<Integer> intList = new ArrayList<Integer>();

		for (Integer i : arr) {
			intList.add(i);

		}

		for (int i = 0; i < intList.size(); i++) {

			if (intList.get(i) != i + 1) {
				System.out.println("The missing Element is " + (i + 1));
				break;
			}

		}

	}
}
