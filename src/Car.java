public class Car extends Vehicle {

	private int milesPerGallon;
	
	public int getMilesPerGallon() {
		return milesPerGallon;
	}
	
	public void setMilesPerGallon(int milesPerGallon) {
		this.milesPerGallon = milesPerGallon;
	}
	
	public Car(boolean operable, int capacity, String power, int efficiency) {
		super(operable, capacity, power);
		this.milesPerGallon = efficiency;
	}
	
	public void deployAirBag() {
		System.out.println("Deploying airbag...");
	}
	
	public String toString() {
		return super.toString() + "\nFuel Economy: " + this.getMilesPerGallon() + "mpg";
	}
	
	public void turnOn() {
		System.out.println("Cranking engine...");
	}
	
	// method that invokes the superclass (parent) turnOn method
	public void genericTurnOn() {
		super.turnOn();
	}
}
