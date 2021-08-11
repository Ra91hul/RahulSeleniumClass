package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		/*
		 * Pseudo code
		 * 
		 */
		String str = "changeme";
		char[] charArr = str.toCharArray();

		for (int i = 0; i < charArr.length; i++) {
			if (i % 2 == 0) {
				char charNew = Character.toUpperCase(charArr[i]);
				System.out.print(charNew);
			} else {
				System.out.print(charArr[i]);
			}
		}
	}

}
