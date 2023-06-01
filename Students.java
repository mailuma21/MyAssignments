package org.student;

public class Students {
public void getStudentInfo(int id) {
	System.out.println("StudentID:"+ id);
}
public void getStudentInfo(int id, String name) {
	System.out.println("student id and name:"+id + name);
}
public void getStudentInfo(String email, double phoneNumber) {
	System.out.println("student email and phoneNumber:"+email + phoneNumber);


}
public static void main(String[] args) {
	Students s = new Students();
	s.getStudentInfo(52);
	s.getStudentInfo(52, "Uma");
	s.getStudentInfo("deqdas@gmail.com", 1234567898);

}
}