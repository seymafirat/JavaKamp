package homework3;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + "İsimli öğrenci kursa kaydolmuştur ");
	}

	public void update(Student student) {
		System.out.println(student.getFirstName() + " " + " İsimli kullanıcının kursu güncellenmiştir");
	}
}
