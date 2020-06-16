package abstractLecture;

abstract class Animal {
	
	int age;
	String habitat;
	String species;
	
	public void sayHello() {
		System.out.println("You greet the animal");
	}
	
	// abstract methods
	// cannot have a body (implementation) b/c will be defined later in subclass
	public abstract void eat();
	public abstract void sleep();
}
