package homework3;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + "�simli ��renci kursa kaydolmu�tur ");
	}

	public void update(Student student) {
		System.out.println(student.getFirstName() + " " + " �simli kullan�c�n�n kursu g�ncellenmi�tir");
	}
}
