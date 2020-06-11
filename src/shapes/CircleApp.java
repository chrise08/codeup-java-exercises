package shapes;

import util.Input;

public class CircleApp {
	
	public static void main(String[] args) {
		
		Input in = new Input();
		
		System.out.print("Enter the number of the circle radius: ");
		
		double userRadius = in.getDouble();
		
		Circle circle = new Circle(userRadius);
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
		// bonus
//		boolean willContinue = false;
//
//		do {
//			System.out.print("Enter the number of the circle radius: ");
//
//			double userRadius = in.getDouble();
//
//			Circle circle = new Circle(userRadius);
//			System.out.println(circle.getArea());
//			System.out.println(circle.getCircumference());
//
//			System.out.print("Continue? [Y/N]");
//
//			willContinue = in.yesNo();
//		} while (willContinue);
//
//		System.out.println("See you next time!");
	}
}
