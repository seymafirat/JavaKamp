package homework3;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println(student.getFirstName() + " " + "Ýsimli öðrenci kursa kaydolmuþtur ");
	}

	public void update(Student student) {
		System.out.println(student.getFirstName() + " " + " Ýsimli kullanýcýnýn kursu güncellenmiþtir");
	}
}
