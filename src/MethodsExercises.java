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
	
	public static void main(String[] args) {
		System.out.println(addition(5, 7));
		System.out.println(subtraction(9, 8));
		System.out.println(multiplication(12, 12));
		System.out.println(division(27, 9));
		System.out.println(modulus(8, 3));
		
	}
}
