package week1.day2.assignments;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// declare an int variable named count
		int count;

		for (int i = 0; i < arr.length; i++) {

			// Assign 0 to count
			count = 0;

			//// iterate from i to the length of the array by adding 1 to it (inner loop
			//// starts here)
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			if (count > 0) {
				System.out.println("Duplicate element in an Array is " + arr[i]);
			}
		}

	}

}
