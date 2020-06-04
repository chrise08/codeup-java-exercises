import java.util.Scanner;

public class Bob {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Do you want to talk to Bob? [Y/N] ");
		String response = scanner.next();
		
		while (response.equalsIgnoreCase("y")) {
			
			System.out.println("Bob: What do you want?");
			scanner.nextLine();
			String toBob = scanner.nextLine();
			
			if (toBob.endsWith("?")) {
				System.out.println("Bob: Sure.");
			} else if (toBob.endsWith("!")) {
				System.out.println("Bob: Woah, chill out!");
			} else if (toBob.length() == 0) {
				System.out.println("Bob: Fine. Be that way!");
			} else {
				System.out.println("Bob: Whatever.");
			}
			
			System.out.print("Say something else to Bob? [Y/N] ");
			response = scanner.next();
		}
		
	}
}
