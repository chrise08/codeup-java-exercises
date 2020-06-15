public class Jet extends Vehicle {
	
	private int maximumAltitude;
	
	public int getMaximumAltitude() {
		return maximumAltitude;
	}
	
	public void setMaximumAltitude(int maximumAltitude) {
		this.maximumAltitude = maximumAltitude;
	}
	
	public Jet(boolean operable, int capacity, String power, int maximumAltitude) {
		super(operable, capacity, power);
		this.maximumAltitude = maximumAltitude;
	}
	
	public void takeOff() {
		System.out.println("Taking off...");
	}
	
	public String toString() {
		return super.toString() + "\nFuel Economy: " + this.getMaximumAltitude() + "ft";
	}
	
	public void turnOn() {
		System.out.println("Igniting jet engines...");
	}
	
	// method that invokes the superclass (parent) turnOn method
	public void genericTurnOn() {
		super.turnOn();
	}
}
