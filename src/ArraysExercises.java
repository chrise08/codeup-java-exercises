
import java.util.Arrays;

public class ArraysExercises {
	
	public static Person[] addPerson(Person[] array, Person person) {
		Person[] newArray = Arrays.copyOf(array, array.length + 1);
		
		newArray[newArray.length - 1] = person;
		
		return newArray;
	}
	
	public static void main(String[] args) {
		
		// create somePeople array with 3 elements and assign new Person objects with names to each index
		Person[] somePeople = new Person[3];
		somePeople[0] = new Person("Tom");
		somePeople[1] = new Person("Dick");
		somePeople[2] = new Person("Harry");
		
		// iterate through and get the name of each element
		for (Person person : somePeople) {
			System.out.println(person.getName());
		}
		
		// use addPerson method to create copy of somePeople, add new Person object with name Sal, and store in new
		// array
		Person[] newGroup = addPerson(somePeople, new Person("Sal"));
		
		// iterate through and get the name of each element in the new array
		for (Person person : newGroup) {
			System.out.println(person.getName());
		}
		
	}
}
