import java.util.Scanner;

public class MethodsExercises {
	static Scanner scanner = new Scanner(System.in);
	
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
	
	// try to use recursion
	public static long getFactorial(int num) {
		
		if (num <= 1) {
			return 1;
		}
		return num * getFactorial(num - 1);
	}
	
	public static int diceRoll(int num) {
		return (int)Math.ceil(Math.random() * num);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println(addition(5, 7));
//		System.out.println(subtraction(9, 8));
//		System.out.println(multiplication(12, 12));
//		System.out.println(division(27, 9));
//		System.out.println(modulus(8, 3));
		
		// Exercise 3 best way
		int userNumber;
		String willContinue;
		
		do {
			userNumber = getInteger(1, 26);
			System.out.printf("Calculate factorial of %d? [Y/N] %n", userNumber);
			willContinue = scanner.next();
		} while (!willContinue.equalsIgnoreCase("y"));
		
		System.out.printf("%d! = %d%n", userNumber, getFactorial(userNumber));
		
//		System.out.print("Enter the number of sides the dice have: ");
//		int sides = scanner.nextInt();
//		System.out.print("Roll dice? [Y/N] ");
//		String willContinue = scanner.next();
//		if (willContinue.equalsIgnoreCase("y")) {
//			System.out.printf("You rolled: %d and %d%n", diceRoll(sides), diceRoll(sides));
//		} else {
//			System.out.println("See you next time.");
//		}
	
	}
}
