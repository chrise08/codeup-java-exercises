package abstractLecture.Appliance;

public class Refrigerator extends Appliance {
	
	@Override
	public void makeSound() {
		System.out.println("Hum hum hum hum...");
	}
	
	@Override
	public void doWork() {
		System.out.println("Keeping food cold...");
	}
}
