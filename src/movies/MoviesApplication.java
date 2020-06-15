package movies;

import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.function.DoubleFunction;

public class MoviesApplication {
	
	public static int userResponse() {
		Input in = new Input();
		
		// prompts user and scans response
		System.out.println("Welcome to the greatest list of movies!");
		System.out.printf("%nWhat would you like to do?%n");
		System.out.printf("0 - exit%n"
		                  + "1 - view all movies%n"
		                  + "2 - view movies in the animated category%n"
		                  + "3 - view movies in the drama category%n"
		                  + "4 - view movies in the horror category%n"
		                  + "5 - view movies in the scifi category%n");
		System.out.printf("%nEnter your choice: ");
		return in.getInt();
	}
	
	public static void showAll() {
		Movie[] movies = MoviesArray.findAll();
		for (Movie movie : movies) {
			System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
		}
	}
	
	public static void showAnimated() {
		Movie[] movies = MoviesArray.findAll();
		for (Movie movie : movies) {
			if (movie.getCategory().equalsIgnoreCase("animated")) {
				System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
			}
		}
	}
	
	public static void showDrama() {
		Movie[] movies = MoviesArray.findAll();
		for (Movie movie : movies) {
			if (movie.getCategory().equalsIgnoreCase("drama")) {
				System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
			}
		}
	}
	
	public static void showHorror() {
		Movie[] movies = MoviesArray.findAll();
		for (Movie movie : movies) {
			if (movie.getCategory().equalsIgnoreCase("horror")) {
				System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
			}
		}
	}
	
	public static void showScifi() {
		Movie[] movies = MoviesArray.findAll();
		for (Movie movie : movies) {
			if (movie.getCategory().equalsIgnoreCase("scifi")) {
				System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
			}
		}
	}
	
	public static boolean willContinue() {
		Input in = new Input();
		
		System.out.printf("%nWould you like to see more? ");
		return in.yesNo();
	}
	
	public static void showMovies() {
		int userChoice;
		do {
			userChoice = userResponse();
			switch (userChoice) {
				case 0:
					System.out.printf("Y'all come back now, ya hear!");
					break;
				case 1:
					showAll();
					break;
				case 2:
					showAnimated();
					break;
				case 3:
					showDrama();
					break;
				case 4:
					showHorror();
					break;
				case 5:
					showScifi();
					break;
			}
		} while (willContinue());
	}
	
	public static void main(String[] args) {
		
		showMovies();
	}
}
