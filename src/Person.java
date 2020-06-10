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
		
//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName())); // returns true
//		System.out.println(person1 == person2); // returns false
		
//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2); // returns true
		
		Person person1 = new Person("John");
		Person person2 = person1;
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person1.getName()); // returns John
		System.out.println(person2.getName()); // returns John
		person2.setName("Jane");
		System.out.println(person1.getName()); // returns Jane because it has same reference id as person2
		System.out.println(person2.getName()); // returns Jane
	}
}
