package util;

import java.util.Scanner;

public class Input {
	
	private Scanner scanner;
	
	public Input() {
		this.scanner = new Scanner(System.in);
	}
	
	public String getString() {
		return scanner.nextLine();
	}
	
	public boolean yesNo() {
//		String answer = getString();
		return getString().toLowerCase().startsWith("y"); // simplest and most memory-efficient way
//		if (answer.equalsIgnoreCase("y")) {
//			return true;
//		} else if (answer.equalsIgnoreCase("yes")) {
//			return true;
//		} else if (answer.equalsIgnoreCase("yeah")) {
//			return true;
//		} else if (answer.equalsIgnoreCase("yup")) {
//			return true;
//		} else {
//			return false;
//		}
	}
	
	public int getInt(int min, int max) {
		int userInt = getInt();
		if (userInt >= min && userInt <= max) {
			return userInt;
		} else {
			System.out.printf("Invalid input. Please input an integer between %d and %d.%n", min, max);
			return getInt(min, max);
		}
	}
	
	public int getInt() {
		if (scanner.hasNextInt()) {
			return scanner.nextInt();
		} else {
			System.out.println("Invalid input. Please input a valid integer.");
			scanner.next();
			return getInt();
		}
	}
	
	public double getDouble(double min, double max) {
		double userDbl = getDouble();
		if (userDbl >= min && userDbl <= max) {
			return userDbl;
		} else {
			System.out.printf("Invalid input. Please input an integer between %f and %f.%n", min, max);
			return getDouble(min, max);
		}
	}
	
	public double getDouble() {
		if (scanner.hasNextDouble()) {
			return scanner.nextDouble();
		} else {
			System.out.println("Invalid input. Please input a valid integer.");
			scanner.next();
			return getDouble();
		}
	}
}
