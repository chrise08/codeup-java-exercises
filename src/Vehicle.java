public class Vehicle {

	private boolean isOperable;
	private int passengerCapacity;
	private String powerSource;
	
	public boolean getisOperable() {
		return isOperable;
	}
	
	public void setOperable(boolean operable) {
		isOperable = operable;
	}
	
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	
	public void setPassengerCapacity(int capacity) {
		this.passengerCapacity = capacity;
	}
	
	public String getPowerSource() {
		return powerSource;
	}
	
	public void setPowerSource(String power) {
		this.powerSource = power;
	}
	
	public Vehicle() {
	
	}
	
	public Vehicle(boolean operable, int capacity, String power) {
		this.isOperable = operable;
		this.passengerCapacity = capacity;
		this.powerSource = power;
	}
	
	public String toString() {
		return "Operable: " + this.getisOperable() + "\nPassenger Capacity: " + this.getPassengerCapacity() + "\nPower "
		       + "Source:"
		       + " " + this.getPowerSource();
	}
	
	public void turnOn() {
		System.out.println("Vehicle is turning on...");
	}
}
