package inheritanceLecture;

public class Animal {
	
	private String species;
	private int age;
	protected String protectedProp = "Protected prop value";
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// need a default empty constructor to allow for inheritance of Animal class
	public Animal() {
	
	}
	
	public Animal(String species, int age) {
		this.species = species;
		this.age = age;
	}
	
	public void makeNoise() {
		System.out.println("This animal is making noise...");
	}
	
//	public String printSummary() {
//		return "Species: " + this.species + "\nAge: " + this.age;
//	}
	
	// can override a default method in Object superclass
	public String toString() {
		return "Species: " + this.species + "\nAge: " + this.age;
	}
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Canus", 7);
	}
}
