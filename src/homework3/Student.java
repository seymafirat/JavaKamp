package homework3;

public class Student extends User{
	int studentId;
	public Student() {
		super();
	}
	public Student(int userId, String email, String password, String firstName, String lastName,int studentId) {
		super(userId, email, password, firstName, lastName);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	
	


}
