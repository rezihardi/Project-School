
public class ScientificStudent extends Student {

	Math math;
	Teacher teacher;
	boolean interview;
	ScientificStudent(String student, String identityNumber, char gender, Math m) {
		super(student, identityNumber, gender);
		math = m;
		// TODO Auto-generated constructor stub
	}

	public boolean isInterview() {
		return interview;
	}

	public void setInterview(boolean interview) {
		this.interview = interview;
	}

	@Override
	public void interview() {
		// TODO Auto-generated method stub
		if(interview) {
			System.out.println("student has interview");
		}
	}
	
	public int getCourseTime() {
		return math.getCourseTime();
	}
	
	public String getCourseCode() {
		return math.getCourseCode();
	}

	public void setMath(Math math) {
		this.math = math;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Math getMath() {
		return math;
	}
	
	

}
