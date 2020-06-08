import java.util.Scanner;

public class HighLow {
	static Scanner scanner = new Scanner(System.in);
	
	public static int getInteger(int min, int max) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Enter a number between %d and %d: ", min, max);
		
		int userInput = scanner.nextInt();
		
		if (userInput >= min & userInput <= max) {
			System.out.println("Your number is within range.");
			return userInput;
		} else {
			System.out.println("Number not within range. Try again.");
		}
		return getInteger(min, max);
	}
	
	public static void highLowGame(int userGuess, int numberToGuess) {
		if (userGuess == numberToGuess) {
			System.out.println("GOOD GUESS!");
		} else if (userGuess < numberToGuess) {
			System.out.println("HIGHER");
			highLowGame(getInteger(1, 100), numberToGuess);
		} else {
			System.out.println("LOWER");
			highLowGame(getInteger(1, 100), numberToGuess);
		}
	}
	
	public static void main(String[] args) {
		
		do {
			int numberToGuess = (int) (Math.random() * 100) + 1;
			highLowGame(getInteger(1,100), numberToGuess);
			System.out.print("Continue? [Y/N]");
			} while (scanner.next().equalsIgnoreCase("y"));
		
	}
}
