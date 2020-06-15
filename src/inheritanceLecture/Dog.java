package inheritanceLecture;

public class Dog extends Animal {
	
//	private String species;
//	private int age;
	private String breed;
	
//	public String getSpecies() {
//		return species;
//	}
//
//	public void setSpecies(String species) {
//		this.species = species;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public void soutProtectedProp() {
		System.out.println(protectedProp);
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	// method overriding toString in Animal superclass
	public String toString() {
		return "Species: " + this.getSpecies() + "\nAge: " + this.getAge() + "\nBreed: " + this.breed;
	}
	
	// method overriding makeNoise in Animal superclass
	public void makeNoise() {
		System.out.println("Bark bark bark!!");
	}
	
	// method inheriting makeNoise method in Animal superclass
	public void makeGenericAnimalNoise() {
		super.makeNoise();
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
	}
}