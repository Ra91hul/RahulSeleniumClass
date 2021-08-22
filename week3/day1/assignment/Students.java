package week3.day1.assignment;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Print id of the student :" + id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: " + id + " && " + "Student Name: " + name);

	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("Student email: " + email + " && " + "Student Phone Number" + phoneNumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students std = new Students();
		std.getStudentInfo(1001);
		std.getStudentInfo(1002, "Rahul");
		std.getStudentInfo("abc@gmail.com", 1234567890L);

	}

}
