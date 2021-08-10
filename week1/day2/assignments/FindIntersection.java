package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare First array
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };

		// Declare Second array
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		// Declare for loop iterator from 0 to array length
		for (int i = 0; i < arr1.length; i++) { // 0<6
			for (int j = 0; j < arr2.length; j++) { // 0 <6
				if (arr1[i] == arr2[j]) { // 3 == 1...
					System.out.println(arr1[i]);
				}

			}

		}

	}

}
