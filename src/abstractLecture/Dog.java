package abstractLecture;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("Eats dog food...");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps in bed...");
	}
}
