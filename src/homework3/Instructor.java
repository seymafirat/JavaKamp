package homework3;

public class Instructor extends User {
	int instructorId;
	public Instructor() {
		super();
	}
	public Instructor(int userId, String email, String password, String firstName, String lastName,int instructorId) {
		super(userId, email, password, firstName, lastName);
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	
}
