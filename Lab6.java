/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Lab6.java
// SPECIFICATION: Create a class to model a superhero.
// FOR: CSE 110- Lab #6
// TIME SPENT: 4 hours because Eclipse decided to not run the right files and wouldn't explain why :)
//-----------------------------------------------------------*/
import.java.util.Scanner;

public class Lab6 {
	
	public static void main(String[] args) {
	// Create a Scanner object for later use
	Scanner scan = new Scanner(System.in);
	
	// Create a superhero called Spider-Man
	System.out.println("Creating Spider-Man.......");
	SuperHero spiderman = new SuperHero("Spider-Man");
	
	// Ask the user to enter a superhero name
	System.out.println("\nWhat is the name of your superhero?");
	String heroName = scan.nextLine(); // This is line 10
	
	System.out.println("What is his secret identity?");
	String secretIdentity = scan.nextLine;
	
	System.out.println("Creating your super hero.......");
	SuperHero myHero = new SuperHero(name, secretIdentity, numberOfPeopleSaved);
	
	System.out.println("\nSpider-Man just saved 100 lives!");
	Spider-Man.getRecordSave;
	
	System.out.println("Oops, Spider-Man was shot dead twice!");
	Spider-Man.getKillHero;
	Spider-Man.getKillHero;
	
	System.out.print("\nYour hero saved a kidnapped kid ");
	System.out.println("but was shot once");
	myHero.getKillHero;
	myHero.getRecordSave;
	
	System.out.println("\n---- Superhero information ----");
	/** 30: Store the number of heroes in an int called numHeroes */
	SuperHero.getNumberOfHeroes()
	{
		int numHeroes = numberOfHeroes();
		return numHeroes;
	}
	
	System.out.println("There are " + numHeroes + " known superheroes.");
	spiderman.printSuperHeroRecord();
	System.out.println();
	
	/** 33: print the record of yourHero */
	SuperHero.printSuperHeroRecord();
}
}//end of class
