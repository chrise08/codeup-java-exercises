import java.util.Scanner;

public class ConsoleExercises {
	
	public static void main(String[] args) {
		double pi = 3.14159;
		
//		System.out.printf("The value of pi is approximately %.2f.", pi);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter an integer: ");
//		int userInput = sc.nextInt();
		
//		System.out.println("Enter three words: ");
//		String firstWord = sc.next();
//		String secondWord = sc.next();
//		String thirdWord = sc.next();
//
//		System.out.println(firstWord);
//		System.out.println(secondWord);
//		System.out.println(thirdWord);
		
//		System.out.print("Enter a sentence: ");
//		String sentence = sc.nextLine();
//
//		System.out.println(sentence);
		
		System.out.print("Enter the length and width (as integers) of a Codeup classroom: ");
		
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double perimeter = length * width;
		double area = (2 * length) + (2 * width);
		double volume = (Math.pow(area, 3));
		
		System.out.printf("The perimeter of the classroom is: %.2f feet.%n", perimeter);
		System.out.printf("The area of the classroom is: %.2f square feet.%n", area);
		System.out.printf("The volume of the classroom is: %.2f cubic feet.", volume);
	}
}
