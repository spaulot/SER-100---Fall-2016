/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Assignment3
// SPECIFICATION: Compute GCD of 2 integers.
// FOR: CSE 110- Assignment 3
// TIME SPENT: 2 hours
//----------------------------------------------------------------------*/
/*Part1:
1a) 10 9 8 7 6 5 4 3 2 
b) 5 15 

2)String str = in.nextLine();
String reverse = "";
		for (int i=str.length()-1; i>=0; i--) 
		{
	        reverse = reverse + str.charAt(i);
	    }
	    System.out.println(reverse);

		
		}
	}
*/

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String [] args)
	{
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter in an integer: ");
		int int1 = in.nextInt();
		System.out.print("Please enter in another integer: ");
		int int2 = in.nextInt();
		//input values for int1 & int2
		
		int gcd = 0;
		
		while (int1 != int2)
		{
			if (int1 > int2)
			{
				int1 -= int2;
			}
			else if (int2 > int1)
			{
				int2 -= int1;
			}
		}
		
		System.out.println("The GCD is " + int1 + ".");
	}
}//end of class
