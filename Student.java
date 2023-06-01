package org.student;

import org.department.Department;

public class Student extends Department{
public void studentName() {
	System.out.println("Uma");
}
public void studentDept() {
	System.out.println("Biotech");
}

public void studentID() {
	System.out.println("34565");
}
public static void main(String[] args) {
	Student s = new Student();
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentName();
	s.studentID();
	s.studentDept();
}
}
