package collections;

import java.util.HashMap;

public class HashMapLecture {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> userIds = new HashMap<>();
		HashMap<String, String> passwords = new HashMap<>();
		HashMap<Integer, String> horses = new HashMap<>();
		
		// setting and modifying key:value pairs
		userIds.put("skurihara", 1);
		userIds.put("jreich5", 2);
		userIds.put("rorsinger", 3);
		userIds.putIfAbsent("jreich", 4); // only sets key:value pair if absent
//		userIds.clear(); // clears HashMap and returns empty curly braces
		userIds.replace("skurihara", 7); // replaces value of this key with what is passed
//		userIds.remove("rorsinger"); // removes key:value pair from HashMap
		
		System.out.println(userIds); // returns string representation of key=value
		System.out.println(userIds.get("jreich5")); // returns 2 (value of this key)
		System.out.println(userIds.containsKey("dstephens")); // returns false
		System.out.println(userIds.containsValue(2)); // returns true
		System.out.println(userIds.get("dstephens")); // returns null
		System.out.println(userIds.getOrDefault("dstephens", 4)); // since it doesn't exist, returns the 4 (assigned
		// default value)
		System.out.println(userIds.isEmpty()); // returns false
		
	}
	
}
