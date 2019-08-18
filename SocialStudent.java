
public class SocialStudent extends Student{
	Economic economicCourse;
	Teacher teacher;
	
	boolean interview;
	
	public SocialStudent(String name, String identity, char gender, Economic e) {
		// TODO Auto-generated constructor stub
		super(name, identity, gender);
		economicCourse = e;
	}

	public Economic getEconomicCourse() {
		return economicCourse;
	}

	@Override
	public void interview() {
		// TODO Auto-generated method stub
		if(interview) {
			System.out.println("student has interview");
		}
	}

	@Override
	public void presentation() {
		// TODO Auto-generated method stub
		
	}
	
	public int getCourseTime() {
		return economicCourse.getCourseTime();
	}
	
	public String getCourseCode() {
		return economicCourse.getCourseCode();
	}

	public void setEconomicCourse(Economic economicCourse) {
		this.economicCourse = economicCourse;
	}
	
	public String getCourseName() {
		return economicCourse.getCourseName();
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public boolean isInterview() {
		return interview;
	}

	public void setInterview(boolean interview) {
		this.interview = interview;
	}
	
	
}
