public class Person {
	
	// properties
	private String name;
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// method
	public void sayHello() {
		System.out.printf("Hello, %s!", getName());
	}
	
	// constructor
	public Person(String name) {
		this.setName(name);
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("Chris");
		
		person.sayHello();
	}
}
