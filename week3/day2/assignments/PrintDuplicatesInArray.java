package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int arr[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		Set<Integer> intSet = new LinkedHashSet<Integer>();
		Set<Integer> dupIntSet = new LinkedHashSet<Integer>();

		for (Integer i : arr) {
			boolean unique = intSet.add(i);
			if (unique == false) {
				dupIntSet.add(i);
			}

		}

		System.out.println("The elements in the list 1 are : " + intSet);
		System.out.println("The elements in the list 2 are : " + dupIntSet);
	}

}
