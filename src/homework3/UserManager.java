package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " : " + "�simli ��renci kursa kaydolmu�tur ");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + "--->" + " �simli kullan�c�n�n kursu g�ncellenmi�tir");
	}
}
