package week3.day1;

public class Calculator {

	public void toAdd(int a, int b) {
		System.out.println("Sum of Add First method " + (a + b));

	}

	public void toAdd(int a, int b, int c) {
		System.out.println("Sum of Add second method " + (a + b + c));

	}

	public void toMultiply(int a, int b) {
		System.out.println("Multiplication of First method " + (a * b));

	}

	public void toMultiply(int a, double b) {
		System.out.println("Multiplication of second method " + (a * b));

	}

	public void toSubtract(int a, int b) {
		System.out.println("Subtraction of First method " + (a - b));

	}

	public void toSubtract(double a, double b) {
		System.out.println("Subtraction of second method " + (a - b));

	}

	public void toDivide(int a, int b) {
		System.out.println("Division of First method " + (a / b));

	}

	public void toDivide(double a, int b) {
		System.out.println("Division of second method " + (a / b));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.toAdd(2, 3);
		calc.toAdd(2, 3, 4);
		calc.toMultiply(2, 2.87);
		calc.toMultiply(3, 4);
		calc.toSubtract(2.55, 3.55);
		calc.toSubtract(3, 2);
		calc.toDivide(3.50, 1);
		calc.toDivide(6, 2);

	}

}
