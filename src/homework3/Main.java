package homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setUserId(2);
		student1.setStudentId(1);
		student1.setFirstName("Şeyma");
		student1.setLastName("Fırat");
		student1.setEmail("seyma@seyma.com");
		student1.setPassword("4434");
		
		Student student2 = new Student();
		student2.setUserId(1);
		student2.setStudentId(2);
		student2.setFirstName("Zehra");
		student2.setLastName("Gökçe");
		student2.setEmail("zehra@seyma.com");
		student2.setPassword("1234");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.update(student2);
		
		System.out.println("SİSTEMDEKİ ÖĞRENCİLER:");
		Student[] students = {student1, student2};
		for(Student  student : students ) {
			System.out.println(student.getUserId()+ " "+ student.getFirstName() + " " + student.getLastName());
		}
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setUserId(1);
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@engin.com");
		instructor1.setPassword("4444");
		
		Instructor instructor2 = new Instructor();
		instructor2.setUserId(2);
		instructor2.setInstructorId(2);
		instructor2.setFirstName("Hira");
		instructor2.setLastName("Fırat");
		instructor2.setEmail("hira@hira.com");
		instructor2.setPassword("1111");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.update(instructor2);
		
		System.out.println("SİSTEMDEKİ ÖĞRETMENLER: ");
		Instructor[] instructors = {instructor1, instructor2};
		for(Instructor  instructor : instructors ) {
			System.out.println(instructor.getUserId()+ " "+ instructor.getFirstName() + " " + instructor.getLastName());
		}
		
		
		
	}

}
