package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " : " + "İsimli öğrenci kursa kaydolmuştur ");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + "--->" + " İsimli kullanıcının kursu güncellenmiştir");
	}
}
