package week1.day1.assignments;

public class PrimeNumber {

	/*
	 * To find whether a number is prime number or not input :- 13 output :- This is
	 * a prime number
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare and int Input and assign a value 13
		int input = 7,remainder;
		
		// Declare a boolean variable flag as false
		boolean flag = false;
		
		// Iterate from 2 to half of the input
		
		for (int i = 2; i <= input/2; i++) {
			// Divide the input with each for loop variable and check the remainder
			
			remainder = input % i;
			if (remainder == 0) {
				flag = true;
				break;
			}
						
		}
		if(flag == true)
			System.out.println("This is not a prime Number");
		else
			System.out.println("This is a prime Number");
	}

}
