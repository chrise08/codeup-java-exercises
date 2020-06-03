import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
		do {
			System.out.print("Enter a numerical grade between 0 and 100: ");
			int userInput = scanner.nextInt();
			
			if (userInput >= 88 & userInput <= 100) {
				String letterGrade = "A";
				System.out.printf("Your letter grade is: %s%n", letterGrade);
			} else if (userInput >= 80 & userInput <= 87) {
				String letterGrade = "B";
				System.out.printf("Your letter grade is: %s%n", letterGrade);
			} else if (userInput >= 67 & userInput <= 79) {
				String letterGrade = "C";
				System.out.printf("Your letter grade is: %s%n", letterGrade);
			} else if (userInput >= 60 & userInput <= 66) {
				String letterGrade = "D";
				System.out.printf("Your letter grade is: %s%n", letterGrade);
			} else if (userInput >= 0 & userInput <= 59) {
				String letterGrade = "F";
				System.out.printf("Your letter grade is: %s%n", letterGrade);
				}
				
			System.out.println("Would you like to continue? [Y/N]");
			String userContinue = scanner.next();
			
			if (userContinue.equalsIgnoreCase("y")) {
				boolean willContinue = true;
			} else if (userContinue.equalsIgnoreCase("n")) {
				boolean willContinue = false;
			}
		} while (willContinue);
	}
}
