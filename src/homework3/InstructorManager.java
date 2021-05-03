package homework3;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + "Ýsimli öðretmen kursta eðitim verecektir. ");
	}

	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + " Ýsimli öðretmenin kursu güncellenmiþtir");
	}
}
