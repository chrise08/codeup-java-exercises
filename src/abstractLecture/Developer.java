package abstractLecture;

public class Developer extends Employee {
	
	public Developer (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public void doWork() {
		System.out.println("Writing some code...");
	}
	
	@Override
	public void lunchBreak() {
		System.out.println("I don't get a lunch break.");
	}
}
