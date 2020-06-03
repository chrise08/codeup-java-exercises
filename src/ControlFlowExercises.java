import java.util.Scanner;

public class ControlFlowExercises {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
		
		System.out.print("What number would you like to go up to?");
		int userInput = scanner.nextInt();
		
		System.out.printf("Here is your table!%n");
		System.out.printf("%nnumber | squared | cubed%n------ | ------- | -----%n");
		
		for (int i = 1; i <= userInput; i++) {
			int squared = i * i;
			int cubed = i * i * i;
			System.out.printf("%-7d| %-8d| %-5d%n", i, squared, cubed);
		}
	}
}
