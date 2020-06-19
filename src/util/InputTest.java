package util;

public class InputTest {
	
	public static void main(String[] args) {
		
		Input in = new Input();
		
//		System.out.print("Would you like to continue? ");
//		boolean yesNo = in.yesNo();
//		System.out.println(yesNo);
		
//		System.out.print("Enter a whole number: ");
//		int num = in.getInt();
//		System.out.printf("You entered %d", num);

//      System.out.print("Please enter a whole number between 1 and 10: ");
//      int numInRange = in.getInt(1, 10);
//      System.out.println("You entered " + numInRange);

      System.out.print("Please enter a number: ");
      double dNum = in.getDouble();
      System.out.println("You entered: " + dNum);

//      System.out.print("Please enter a whole number between 1 and 10: ");
//      double dNumInRange = in.getDouble(1, 10);
//      System.out.println("You entered " + dNumInRange);
	
	}
}
