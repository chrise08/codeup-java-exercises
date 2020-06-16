package abstractLecture;

public class Dog extends Animal implements CanWalk, CanSwim {
	
	@Override
	public void eat() {
		System.out.println("Eats dog food...");
	}
	
	@Override
	public void sleep() {
		System.out.println("Sleeps in bed...");
	}
	
	@Override
	public void moveForward() {
		System.out.println("Moving forward...");
	}
	
	@Override
	public void moveBackward() {
		System.out.println("Moving backward...");
	}
	
	@Override
	public void crawl() {
		System.out.println("Crawling...");
	}
	
	@Override
	public void swimForward() {
		System.out.println("Swimming forward...");
	}
	
	@Override
	public void swimBackwards() {
		System.out.println("Swimming backward...");
	}
}
