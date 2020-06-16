package abstractLecture.Appliance;

public class Blender extends Appliance {
	
	@Override
	public void makeSound() {
		System.out.println("Bzzzzzzzz...");
	}
	
	@Override
	public void doWork() {
		System.out.println("Blending ingredients...");
	}
}
