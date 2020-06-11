package util;

import java.util.Scanner;

public class Input {
	
	private Scanner scanner;
	
	public Input() {
		this.scanner = new Scanner(System.in);
		System.out.println("this is input");
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
		if (getInt() > min && getInt() < max) {
			return getInt();
		} else {
			do {
				System.out.printf("Please enter an whole number between %d and %d: ", min, max);
				return getInt();
			} while (getInt() < min || getInt() > max);
		}
	}
	
	public int getInt() {
		return scanner.nextInt();
	}
	
	public double getDouble(double min, double max) {
		if (getDouble() > min && getDouble() < max) {
			return getDouble();
		} else {
			do {
				System.out.printf("Please enter a number between %.2f and %.2f: ", min, max);
				return getDouble();
			} while (getDouble() < min || getDouble() > max);
		}
	}
	
	public double getDouble() {
		return scanner.nextDouble();
	}
}
