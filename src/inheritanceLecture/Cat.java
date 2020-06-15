package inheritanceLecture;

public class Cat extends Animal {

	private int numOfLivesLeft;
	
	public int getNumOfLivesLeft() {
		return numOfLivesLeft;
	}
	
	public void setNumOfLivesLeft(int numOfLivesLeft) {
		this.numOfLivesLeft = numOfLivesLeft;
	}
	
	public Cat(String species, int age, int numOfLivesLeft) {
		// next line uses the superclass (parent) constructor to set these two values how that constructor is setup
		// to do
		// the parameters MUST be passed in the same order as they appear in the superclass (parent) constructor
		super(species, age);
		this.numOfLivesLeft = numOfLivesLeft;
	}
	
	public void makeNoise() {
		System.out.println("Meow meow!");
	}
}
