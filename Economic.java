public class Economic extends Course{
	String course;
	Economic(int courseTime, String courseCode, String courseName) {
		super(courseTime, courseCode, courseName);
		// TODO Auto-generated constructor stub
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
}
