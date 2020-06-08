import java.util.Scanner;

public class MethodsExercises {
	
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
			System.out.println("Your number is within range. Goodbye.");
			return userInput;
		} else {
			System.out.println("Number not within range. Try again.");
		}
		return getInteger(min, max);
	}
	
	public static void main(String[] args) {
//		System.out.println(addition(5, 7));
//		System.out.println(subtraction(9, 8));
//		System.out.println(multiplication(12, 12));
//		System.out.println(division(27, 9));
//		System.out.println(modulus(8, 3));
		
		System.out.print("Enter a number between 1 and 10: ");
		int userInput = getInteger(1, 10);
		
	}
}
