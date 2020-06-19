package exceptionsLecture;

import java.sql.SQLException;

public class ExceptionLecture {
	
	public static void main(String[] args) {
		
		// It is possible to write code that will throw a RuntimeException

//        String[] names = {"cathy", "bob"};
//        System.out.println(names[10]);

//        int x = 3;
//        int y = 0;

//        System.out.println(x / y);

//
//        String st = null;
//        System.out.println(st.length());
//
		
		// Exceptions can also be thrown explicitly

//        throw new RuntimeException("Something went wrong");
//        throw new ArrayIndexOutOfBoundsException("asdf asdf asdf");
		
		// Exceptions may be be handled with a a try-catch block
		// Be sure that the order of caught exceptions is most specific to least specific

        try {
            String st = null;
            System.out.println(st.toUpperCase());
        } catch(ArithmeticException e) {
            System.out.println("Error in arithmetic!");
        } catch (RuntimeException e) {
            System.out.println("A runtime exception happened!");
        } catch(Exception e) {
            System.out.println("Something went wrong!");
            System.out.println(e.getMessage());
        }

        System.out.println("it will run");
		
		
		
		// checked exception is any exception NOT descended from RuntimeException
		// must be handled
		// unchecked exception is any exception descended from RuntimeException
		// does not have to be handled
		
		// Unchecked exceptions MUST be handled by a try catch or handled by another method (indicated with the throws clause)
		// (the finally block always runs regardless of an exception being thrown or not)
//        try {
//            throw new SQLException("Something went wrong");
//
//        } catch(SQLException e) {
//            throw new RuntimeException("Error occurred when adding a record.");
//        } finally {
//            System.out.println("This always runs!");
//        }

//        try {
//            throw new Exception("Uh oh");
//        } catch(Exception e) {
//            e.printStackTrace();
//
//        }
		
		
		// Using the throws clause
		
		// calling a method that handles an exception

//            thisHandlesAnException();
		
		// using throws in a method, we can kick the responsibility of handling the exception up the chain

//            try {
//                thisMakesAnException();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
		
		
		// Catching a custom exception

//        try {
//            soutName("Bob"); // cannot call soutName without exception handling
//        } catch (NameIsBobException e) {
//            e.printStackTrace();
//        }
	
	
	}
	
	public static void thisHandlesAnException() {
		try {
			throw new Exception("Yep, an exception again :(");
		} catch (Exception e) {
			System.out.println("EXCEPTION!!!");
			System.out.println(e.getMessage());
		}
	}
	
	public static void thisMakesAnException() throws Exception {
		throw new Exception("Exception!");
	}
	
	public static void soutName(String name) throws NameIsBobException {
		if (name.equalsIgnoreCase("bob")) {
			throw new NameIsBobException("NOOOOOOO!!!!");
		} else {
			System.out.println(name);
		}
	}
	
}