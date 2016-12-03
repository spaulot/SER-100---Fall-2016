/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: MovieSeating.java
// SPECIFICATION: Create movie theatre from user input.
// FOR: CSE 110- Lab #6
// TIME SPENT: 8 hours
//-----------------------------------------------------------*/
public class MovieSeating {
	public String[][] seating;
	
	public MovieSeating(int rowNum, int columnNum){
		seating = new String[rowNum][columnNum];
		Customer temp = new Customer();
		String fName = temp.getFirstName();
		String lName = temp.getLastName();
		
		for (int x = 0; x < rowNum; x++) {
			for (int y = 0; y < columnNum; y++) {
				seating[x][y] = fName + " " + lName;
				}
			}
		}
		
		private Customer getCustomerAt(int row, int col){
            return new Customer(seating[row][col]);
		}
		
		public boolean assignCustomerAt(int row, int col, Customer tempCustomer){
			if (seating[row][col].equals("???")) {
				tempCustomer = new Customer(seating[row][col]);
				return true;
			} else {
				System.out.println("Seat taken.");
				return false;
			}
			
	}
		
		public boolean checkBoundaries(int row, int col){
			boolean boundary;
			if (row < 0 || col < 0){
				boundary = true;
				return boundary;
			}
			else
				boundary = false;
				return boundary;
		}
			
		public String toString(){
			String result = "The current seating" + "\n" + "--------------------" + "\n";
			for (int r = 0; r < rowNum; r++) {
				for (int c = 0; c < columnNum; c++) {
					result += seating[row][col];
				}
			}
			return result;
					
	}
}//end of class
