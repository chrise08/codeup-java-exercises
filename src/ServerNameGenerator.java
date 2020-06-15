import java.util.Random;

public class ServerNameGenerator {

	private static String[] adjectives = {"cool", "funny", "nice", "scary", "great", "red", "evil", "rich", "poor",
			"pure"};
	
	private static String[] nouns = {"dog", "man", "cat", "monkey", "job", "trip", "banana", "car", "boat", "shirt"};
	
	// method to get random element from passed array
	public static String randomElement(String[] array) {
		// generates a random number between inclusive 0 and last index of array
		Random random = new Random();
		int randomInt = random.nextInt(array.length);
		
		return array[randomInt];
	}
	
	public static void main(String[] args) {
		
		String randomAdjective = randomElement(adjectives);
		String randomNoun = randomElement(nouns);
		
		System.out.printf("Here is your server name:%n%s-%s%n", randomAdjective, randomNoun);
	}

}
