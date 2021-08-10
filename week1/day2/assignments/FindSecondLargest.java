package week1.day2.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(arr);

		System.out.println("The Second Largest number in an array is " + arr[arr.length - 2]);

	}

}
