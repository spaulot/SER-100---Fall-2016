	/*-------------------------------------------------------------------------
	// AUTHOR: Samantha Paulot
	// FILENAME: Lab5.java
	// SPECIFICATION: Open/close doors, and print a check to ensure it worked properly.
	// FOR: CSE 110- Lab #5
	// TIME SPENT: 3 hours
	//-----------------------------------------------------------*/
/**
	A class to test the Door class.
	*/
	public class Lab5{
	/**
	Tests the methods of the Door class
	@param args not used
	*/
	public static void main(String[] args) {
	// Create a new Door object named ?Front? with initial state ?open?
	Door frontDoor = new Door("front", "open");
	// Print a check that the constructor created the object correctly
	System.out.println("The " + frontDoor.getName() + " door is " + frontDoor.getState());
	System.out.println("Expected: open");
	// Create a second Door object with a name ?Back? and state ?closed?
	Door backDoor = new Door("back", "closed");
	// Print a check that the constructor created the object correctly
	System.out.println("The " + backDoor.getName() + " door is " + backDoor.getState());
	System.out.println("Expected: closed");
	// Test the open() method to open the backDoor
	backDoor.open();
	System.out.println("The back door is " + backDoor.getState());
	System.out.println("Expected: open");
	// Use the mutator to change the name variable
	backDoor.setName("kitchen");
	System.out.println("The back door is now called " + backDoor.getName());
	System.out.println("Expected: kitchen");
	//Part 8
	Door sideDoor = new Door("side", "open");
	//Create a third Door with a name "Side" and state "open"
	System.out.println("The " + sideDoor.getName() + " door is " + sideDoor.getState());
	System.out.println("Expected: open");
	sideDoor.close();
	//close the side door
	System.out.println("The side door is " + sideDoor.getState());
	System.out.println("Expected: closed");
	//print a check that the constructor created the object correctly
	}
	}


