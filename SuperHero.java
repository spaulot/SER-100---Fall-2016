public class SuperHero {
		// instance variables go below here
		private static int numberOfHeroes;
		private String heroName;
		private String secretIdentity;
		private int numberOfLifeChances;
		private int numberOfPeopleSaved;
		
		// the two constructors go below here
		public SuperHero(String initHeroName, String initSecretIdentity, int initPeopleSaved) {
			numberOfHeroes++; // one more hero created
			numberOfLifeChances = 2; // start the hero with two lives
			heroName = initHeroName;
			secretIdentity = initSecretIdentity;
			numberOfPeopleSaved = initPeopleSaved;
			}
		
		public SuperHero(String initheroName) {
			numberOfHeroes++;
			numberOfLifeChances = 2;
			numberOfPeopleSaved = 0;
			secretIdentity = "unknown";
			numberOfPeopleSaved = 0;	
		}
		
		// getNumberOfHeroes() goes below here
		public static int getNumberOfHeroes() {
			return numberOfHeroes;
		}
		
		// recordSave() goes below here
		public void recordSave() {
			numberOfPeopleSaved++;
		}
		
		// the second recordSave method goes here
		public void recordSave(int num){
			numberOfPeopleSaved += num;
		}
		
		// killHero() goes below here
			public void killHero() 
			{
				if (numberOfLifeChances > 0) 
				{
				// Decrease numberOfLifeChances by 1
					numberOfLifeChances--;
				} 
				else {
				// Print a message saying the hero is dead
					System.out.println("Your hero is dead! ):");
				}
			}
		
		// printSuperHeroRecord() goes below here
			public void printSuperHeroRecord(){
			System.out.println("Name: " + heroName);
			System.out.println("Secret Identity: " + secretIdentity);
				if (numberOfLifeChances == 0)
				{
					System.out.println("Status: Dead");
				}
				else
				{
					System.out.println("Status: Alive");
				}
			System.out.println("People Saved: " + numberOfPeopleSaved);
			}
}//end of class
