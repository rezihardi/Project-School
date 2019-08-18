import java.util.ArrayList;

public class Class {
	String classCourse;
	String className;
	static int studentCount = 0;
	ArrayList<Student> s = new ArrayList<Student>();
	Teacher t;
	public Class(String className, String classCourse) {
		this.className = className;
		this.classCourse = classCourse;
	}
	public ArrayList<Student> getStudent() {
		return s;
	}
	public void setStudent(Student s) {
		this.s.add(s);
		studentCount++;
	}
	public Teacher getTeacher() {
		return t;
	}
	public void setTeacher(Teacher t) {
		this.t = t;
	}
	public String getClassName() {
		return className;
	}
	public int getStudentCount() {
		return studentCount;
	}
	public String getClassCourse() {
		return classCourse;
	}
	public void setClassCourse(String classCourse) {
		this.classCourse = classCourse;
	}
	
	
}
