package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data); // {2,3,4,6,7,11}

		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			list.add(data[i]);

		}

		System.out.println("The list elements are : " + list);
		System.out.println("Second Largest Element is " + list.get(data.length - 2));

	}

}
