package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		/*
		 * Psuedo Code 
		 * Input String = "I am a software tester" 
		 * split words into an array
		 * 
		 */

		String str = "I am a software tester";
		String[] splitStr = str.split(" ");
		for (int i = 0; i < splitStr.length; i++) {
			if (i % 2 != 0) {
				int lenOfOddIndexWords = splitStr[i].length();
				for (int j = lenOfOddIndexWords-1; j >=0; j--) {
					System.out.print(splitStr[i].charAt(j));
					
				}
				System.out.print(" ");
			}
			else
				System.out.print(splitStr[i] + " ");
		}
	}

}
