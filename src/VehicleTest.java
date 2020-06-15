public class VehicleTest {
	
	// method that takes in an array of Vehicle objects and invokes their individual turnOn method
	public static void turnOnVehicles(Vehicle[] vehicles) {
		for (Vehicle vehicle : vehicles) {
			vehicle.turnOn();
		}
	}
	
	public static void main(String[] args) {
		// instantiating new objects of each type
		Vehicle v = new Vehicle();
		Jet j = new Jet(true, 2, "gasoline", 30_000);
		Car c = new Car(true, 4, "gasoline", 50);
		
		
		// setting values for each objects fields
		v.setOperable(true);
		v.setPassengerCapacity(4);
		v.setPowerSource("gasoline");
		
		// create array of Vehicle objects and assigning value to each element
		Vehicle[] vehicles = new Vehicle[3];
		vehicles[0] = v;
		vehicles[1] = c;
		vehicles[2] = j;
		
		// running method to invoke each object's unite turnOn method
		turnOnVehicles(vehicles);
		
		// invokes the genericTurnOn method in each subclass
		j.genericTurnOn();
		c.genericTurnOn();

//		j.setOperable(true);
//		j.setPassengerCapacity(2);
//		j.setPowerSource("jet fuel");

//		c.setOperable(true);
//		c.setPassengerCapacity(4);
//		c.setPowerSource("gasoline");
		
		// printing out the toString method for each object
		System.out.println(v.toString());
		System.out.println();
		System.out.println(j.toString());
		j.takeOff();
		System.out.println();
		System.out.println(c.toString());
		c.deployAirBag();
	}
}
