package collections;

import java.util.*;

//import java.util.ArrayList;
//import java.util.HashMap;

public class ArrayListLecture {
	
	public static void main(String[] args) {
		
		// Creating ArrayLists
		ArrayList<String> instructors = new ArrayList<>();
		
		// preferred way of creating ArrayLists is to assign to generic List<> as below
		List<Integer> numbers = new ArrayList<>();
		List<Person> people = new ArrayList<>();
		List<String> empty = new ArrayList<>();
		
		// Adding elements to ArrayLists
		instructors.add("Justin");
		instructors.add("Sophie");
		instructors.add("Casey");
		instructors.add("Vivian");
		instructors.add(0, "David");
		
		System.out.println(instructors);
		System.out.println(instructors.size());
		
		numbers.add(10);
		numbers.add(2);
		numbers.add(6);
		numbers.add(10);
		numbers.add(10);
		
		System.out.println(numbers);
		System.out.println(numbers.get(1)); // returns 2
		System.out.println(numbers.indexOf(10)); // returns 0
		System.out.println(numbers.indexOf(8)); // returns -1
		
		people.add(new Person("bob", "ross"));
		people.add(new Person("jane", "doe"));
		people.add(0, new Person("john", "smith"));
		
		System.out.println(people);
		
		// need to iterate over ArrayList and use getter to sout names
		for (Person person : people) {
			System.out.println(person.getFirstName());
		}
		
		// check if ArrayList contains a certain element
		System.out.println(instructors.contains("Justin")); // returns true
		System.out.println(instructors.contains("justin")); // returns false
		
		// find last index of certain element in ArrayList
		System.out.println(numbers.lastIndexOf(10)); // returns 4
		
		// check if the ArrayList is empty
		System.out.println(empty.isEmpty()); // returns true
		
		// remove element from ArrayList (two variations)
		// next line would remove the first instance of "David"
//		instructors.remove("David");
		instructors.remove(0);
		System.out.println(instructors);
	}
}
