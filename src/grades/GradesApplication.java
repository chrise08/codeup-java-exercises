package grades;

import java.util.HashMap;

public class GradesApplication {
	
	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<>();
		
		Student student1 = new Student("Billy");
		student1.addGrade(100);
		student1.addGrade(75);
		student1.addGrade(80);
		students.put("bigkid95", student1);
		
		Student student2 = new Student("Mandy");
		student2.addGrade(90);
		student2.addGrade(100);
		student2.addGrade(75);
		students.put("worlddomination93", student2);
		
		Student student3 = new Student("Jack");
		student3.addGrade(100);
		student3.addGrade(100);
		student3.addGrade(90);
		students.put("20th_century_samurai", student3);
		
		Student student4 = new Student("Courage");
		student4.addGrade(75);
		student4.addGrade(80);
		student4.addGrade(70);
		students.put("XXthe_cowardly_dogXX", student4);
		
	}
}
