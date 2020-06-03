public class ControlFlowExercises {
	
	public static void main(String[] args) {
	
	double i = 2;
	
	do {
		System.out.printf("%.0f%n", i);
		i = Math.pow(i, 2);
	} while (i < 1000000);
	}
}
