/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Assignment5.java
// SPECIFICATION: Create a class Geek that models a Geek.
// FOR: CSE 110- Lab #6
// TIME SPENT: 3 hours
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Assignment5 {

	public static void main (String[] args) {

		Scanner console = new Scanner(System.in);

		String choice;
		char command;


		// print the menu
		printMenu();
		
		// create new Geek object
		Geek myGeek = new Geek("Geek", 0);

		do
		{
			// ask a user to choose a command
			System.out.println("\nPlease enter a command or type ?");
			choice = console.next().toLowerCase();
			command = choice.charAt(0);

			switch (command)
			{
				case 'a':
					//prints the Geek's name
					
					System.out.println("Name: " + myGeek.getName());
					break;
				case 'b': //
					System.out.println("Number of questions: " + 
					myGeek.getNumberOfQuestions());
					break;
				case 'c': //
					//asks for two integers and finds and prints if their sum is even or odd
					System.out.println("Please enter one integer: ");
					int num1 = console.nextInt();
					System.out.println("Please enter another integer: ");
					int num2 = console.nextInt();
					myGeek.isEven(num1, num2);
					if (myGeek.isEven(num1, num2) == true)
					{
						System.out.println("The sum of the numbers is even.");
					}
					else
					{
						System.out.println("The sum of the numbers is odd.");
					}
					break;
				case 'd': //
					//asks for two integers and finds and prints the sum of all integers between them (inclusive)
					System.out.println("Please enter one integer: ");
					num1 = console.nextInt();
					System.out.println("Please enter another integer: ");
					num2 = console.nextInt();
					myGeek.sum(num1, num2);
					System.out.println(myGeek.sum(num1, num2));
					break;
				case 'e': //
					//asks for a year and finds out and prints if is leap year or not
					System.out.println("Please enter in a year: ");
					int year = console.nextInt();
					myGeek.leapYear(year);
					if (myGeek.leapYear(year) == true)
					{
						System.out.println(year + " is a leap year.");
					}
					else
					{
						System.out.println(year + " is not a leap year.");
					}
					
					break;
				case '?':
					printMenu();
					break;
				case 'q':
					break;

				default:
					System.out.println("Invalid input");

			}

		} while (command != 'q');

	}  //end of the main method


	public static void printMenu()
	{
		System.out.print("\nCommand Options\n"
			+ "-----------------------------------\n"
			+ "a: get name\n"
			+ "b: number of questions asked\n"
			+ "c: sum is even\n"
			+ "d: sum between two integers\n"
			+ "e: leap year\n"
			+ "?: display the menu again\n"
			+ "q: quit this program\n\n");

	} // end of the printMenu method

}  // end Assignment5 class