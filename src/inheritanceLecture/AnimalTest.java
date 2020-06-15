package inheritanceLecture;

public class AnimalTest {
	
	// polymorphism that passes array of animal objects and calls each makeNoise method within them even though they
	// are different
	public static void makeAnimalsNoisy(Animal[] animals) {
		for (Animal a : animals) {
			a.makeNoise();
		}
	}
	
	public static void main(String[] args) {
		
//		Animal a = new Animal();
		Dog d = new Dog();
//		Cat c = new Cat();
		Cat c = new Cat("feline", 7, 9);
		
		// create the array of Animal objects and assign elements
		Animal[] animals = new Animal[2];
		animals[0] = d;
		animals[1] = c;
		
		// invoke method and pass in new array
		makeAnimalsNoisy(animals);
		
//		a.setAge(3);
//		a.setSpecies("primate");
//
//		d.setAge(7);
//		d.setSpecies("canine");
//
//		c.setAge(2);
//		c.setSpecies("feline");
		
		// because this method is public in superclass, it can be inherited
//		a.makeNoise();
//		d.makeNoise();
//		c.makeNoise();
		
//		System.out.println(a.toString());
//		System.out.println(d.toString());
//		System.out.println(c.toString());
		
		d.setSpecies("canine");
		d.setAge(3);
		d.setBreed("pug");
		d.soutProtectedProp();
		
		System.out.println(d.toString());
	}
}
