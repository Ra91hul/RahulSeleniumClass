package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Print the student Name");
	}

	public void studentDept() {
		System.out.println("Print the student Department");
	}

	public void studentId() {
		System.out.println("Print the student Id");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		System.out.println("Multi-Level Inheritance :- Calling College(Super Class) elements from Student Class");
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		System.out.println("Multi-Level Inheritance :- Calling Department(Parent Class) elements from Student Class");
		std.deptName();
		System.out.println("Multi-Level Inheritance :- Calling own methods from Student Class");
		std.studentName();
		std.studentDept();
		std.studentId();

	}

}
