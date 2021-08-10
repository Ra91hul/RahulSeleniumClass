package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		// here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };

		// sort the array
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int a = 1;
			if (arr[i] != i + 1) {
				System.out.println("The missing element is " + (arr[i] - 1));// Array Element minus 1
				break;
			}

		}

	}

}
