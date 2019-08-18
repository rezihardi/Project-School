
public class Course {
	int courseTime;
	String courseCode;
	String courseName;
	
	Course(int courseTime, String courseCode, String courseName){
		this.courseTime = courseTime;
		this.courseCode = courseCode;
		this.courseName = courseName;
	}

	public int getCourseTime() {
		return courseTime;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public String getCourseName() {
		return courseName;
	}
	
	
}
