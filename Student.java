
public abstract class Student implements Activity {
	String studentName;
	String identityNumber;
	char gender;

	boolean exam;
	boolean exercise;
	boolean presentation;
	
	Student(String student, String identityNumber, char gender){
		this.studentName = student;
		this.identityNumber = identityNumber;
		this.gender = gender;
	}
	
	public String getName() {
		return studentName;
	}
	
	public String getIdentityNumber() {
		return identityNumber;
	}
	
	public String getGender() {
		if(gender == 'L') {
			return "Laki-laki";
		}else {
			return "Perempuan";
		}
	}
	

	@Override
	public void exam() {
		// TODO Auto-generated method stub
		if(exam) {
			System.out.println("Student has exam");
		}
	}

	@Override
	public void exercise() {
		// TODO Auto-generated method stub
		if(exercise) {
			System.out.println("Student has exercise");
		}
	}
	

	@Override
	public void presentation() {
		// TODO Auto-generated method stub
		if(presentation) {
			System.out.println("Student has presentation");
		}
	}

	public boolean isExam() {
		return exam;
	}

	public void setExam(boolean exam) {
		this.exam = exam;
	}

	public boolean isExercise() {
		return exercise;
	}

	public void setExercise(boolean exercise) {
		this.exercise = exercise;
	}

	public boolean isPresentation() {
		return presentation;
	}

	public void setPresentation(boolean presentation) {
		this.presentation = presentation;
	}
	
	
}
