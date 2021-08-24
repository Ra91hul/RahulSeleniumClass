package week3.day2.assignments;

public class Desktop implements Hardware, Software {

	public static void main(String[] args) {
		Desktop dsk = new Desktop();
		dsk.hardwareResource(2, 3);
		dsk.softwareResources("Rahul");

	}

	public String softwareResources(String name) {
		System.out.println("Software Resources : " + name);
		return null;
	}

	public int hardwareResource(int a, int b) {
		System.out.println("Hardware Resources sum is : " + (a + b));
		return 0;
	}

}
