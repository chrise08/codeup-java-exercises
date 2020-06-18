package grades;

import java.util.HashMap;
import java.util.Map;
import util.Input;

public class GradesApplication {
	
	public static int userResponse() {
		Input in = new Input();
		
		// prompts user and scans response
		System.out.printf("%nWhat would you like to do?%n");
		System.out.printf("0 - exit%n"
		                  + "1 - search for an individual student%n"
		                  + "2 - view all grades%n"
		                  + "3 - view class average%n"
		                  + "4 - view csv report of all students%n");
		System.out.printf("%nEnter your choice: ");
		return in.getInt();
	}
	
	public static boolean searchAgain() {
		
		Input in = new Input();
		
		System.out.println("Would you like to see another student?");
		return in.yesNo();
	}
	
	public static boolean willContinue() {
		Input in = new Input();
		
		System.out.printf("%nWould you like to see more? ");
		return in.yesNo();
	}
	
	public static void main(String[] args) {
		
		Input in = new Input();
		
		HashMap<String, Student> students = new HashMap<>();
		Map<Integer, Student> searchable = new HashMap<>();
		
		Student student1 = new Student("Billy");
		student1.addGrade(100);
		student1.addGrade(75);
		student1.addGrade(80);
		students.put("bigkid95", student1);
		searchable.put(1, student1);
		
		Student student2 = new Student("Mandy");
		student2.addGrade(90);
		student2.addGrade(100);
		student2.addGrade(75);
		students.put("worlddomination93", student2);
		searchable.put(2, student2);
		
		Student student3 = new Student("Jack");
		student3.addGrade(100);
		student3.addGrade(100);
		student3.addGrade(90);
		students.put("20th_century_samurai", student3);
		searchable.put(3, student3);
		
		Student student4 = new Student("Courage");
		student4.addGrade(75);
		student4.addGrade(80);
		student4.addGrade(70);
		students.put("XXthe_cowardly_dogXX", student4);
		searchable.put(4, student4);
		
		
		System.out.println("Welcome!");
		System.out.println();
		
		int userChoice;
		
		do {
			userChoice = userResponse();
			switch (userChoice) {
				case 0:
					System.out.println("Goodbye, and have a wonderful day!");
					break;
				case 1:
					do {
						System.out.println("Here are the GitHub usernames of our students:");
						System.out.println();
						
						for (String username : students.keySet()) {
							System.out.printf("|%s| ", username);
						}
						
						System.out.println();
						System.out.println();
						System.out.println("What student would you like to see more information on?");
						String studentToFind = in.getString();
						
						if (!students.containsKey(studentToFind)) {
							System.out.printf("Sorry, no student found with the Github username of \"%s\".%n", studentToFind);
							System.out.println();
						} else {
							System.out.printf("Name: %s - GitHub Username: %s%n"
							                  + "Current Average: %.2f%n", students.get(studentToFind).getName(), studentToFind,
							                  students.get(studentToFind).getGradeAverage());
							System.out.println();
						}
					} while(searchAgain());
					break;
				case 2:
					for (Map.Entry<Integer, Student> entry : searchable.entrySet()) {
						System.out.printf("#%d %s", entry.getKey(), entry.getValue().toString());
					}
					break;
				case 3:
					break;
				case 4:
					
					break;
			}
		} while (willContinue());
		
	}
}
