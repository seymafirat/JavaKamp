package homework3;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + "�simli ��retmen kursta e�itim verecektir. ");
	}

	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + " �simli ��retmenin kursu g�ncellenmi�tir");
	}
}
