import java.util.Scanner;

public class MethodsExercises {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println(addition(5, 7));
//		System.out.println(subtraction(9, 8));
//		System.out.println(multiplication(12, 12));
//		System.out.println(division(27, 9));
//		System.out.println(modulus(8, 3));
		
//		System.out.print("Enter a number between 1 and 10: ");
//		int userInput = getInteger(1, 10);
//		long factorial = getFactorial(userInput);
//
//		System.out.print("Display factorial? [Y/N] ");
//		String userContinue = scanner.next();
//
//		if (userContinue.equalsIgnoreCase("y")) {
//			System.out.printf("%d! = %d%n", userInput, factorial);
//		} else {
//			System.out.println("Goodbye.");
//		}
		
		System.out.print("Enter the number of sides the dice have: ");
		int sides = scanner.nextInt();
		System.out.print("Roll dice? [Y/N] ");
		String willContinue = scanner.next();
		if (willContinue.equalsIgnoreCase("y")) {
			System.out.printf("You rolled: %d and %d%n", diceRoll(sides), diceRoll(sides));
		} else {
			System.out.println("See you next time.");
		}
		
	}
	
	public static int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	public static int division(int num1, int num2) {
		return num1 / num2;
	}
	
	public static int modulus(int num1, int num2) {
		return num1 % num2;
	}
	
	public static int getInteger(int min, int max) {
		Scanner scanner = new Scanner(System.in);
		
		int userInput = scanner.nextInt();
		
		if (userInput >= min & userInput <= max) {
			System.out.println("Your number is within range.");
			return userInput;
		} else {
			System.out.println("Number not within range. Try again.");
		}
		return getInteger(min, max);
	}
	
	public static long getFactorial(int num) {
		
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int diceRoll(int num) {
		return (int)Math.ceil(Math.random() * num);
	}
}
