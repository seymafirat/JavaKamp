package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " : " + "Ýsimli öðrenci kursa kaydolmuþtur ");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + "--->" + " Ýsimli kullanýcýnýn kursu güncellenmiþtir");
	}
}
