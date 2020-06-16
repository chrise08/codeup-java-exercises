package abstractLecture.Appliance;

public class Microwave extends Appliance {
	
	@Override
	public void makeSound() {
		System.out.println("Hmmmmmm....");
	}
	
	@Override
	public void doWork() {
		System.out.println("Warming up food...");
	}
}
