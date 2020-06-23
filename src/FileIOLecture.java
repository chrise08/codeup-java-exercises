import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLecture {

	
	public static void main(String[] args) {
		
		Path myDirectory = Paths.get("src");
//		Path myFile = Paths.get("Bob.java");
		Path myFile = Paths.get("src", "Bob.java");
		
		System.out.println(Files.exists(myDirectory)); // returns true
		System.out.println(Files.exists(myFile)); // returns false if myFile does not have a directory argument like
		// the commented out line above (b/c from the root of the folder, Bob.java file cannot be seen. MUST pass in
		// a directory to look into
		
		Path gitignoreFile = Paths.get(".idea", ".gitignore");
		
		System.out.println(Files.exists(gitignoreFile)); // returns true
		
		// creating a directory that does not exist
		String directory = "test";
		Path myTest = Paths.get(directory);
		
		if (Files.notExists(myTest)) {
			try {
				Files.createDirectory(myTest);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// creating a file that does not exist INSIDE of the test directory
		Path helloFile = Paths.get(directory, "hello.txt");
		
		if (Files.notExists(helloFile)) {
			try {
				Files.createFile(helloFile);
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// writing to hello.txt
		String[] names = {"justin", "sophie", "vivian"};
		List<String> instructors = Arrays.asList(names);
		
		try {
			Files.write(helloFile, instructors);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// reading from hello.txt
		// only need below 6 lines if the file is being modified (ex. by a user) to read the modified file
//		try {
//			List<String> myInstructors = Files.readAllLines(helloFile);
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
		
		// adding to hello.txt without overwriting
		try {
			Files.write(helloFile, Arrays.asList("david"), StandardOpenOption.APPEND);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// replacing a line in hello.txt
		List<String> newInstructorsList = new ArrayList<>();

		for (String instructor : instructors) {
			if (instructor.equals("david")) {
				newInstructorsList.add("trant");
				continue;
			}
			newInstructorsList.add(instructor);
		}
		try {
			Files.write(helloFile, newInstructorsList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(newInstructorsList);
	}
}
