/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Geek.java
// SPECIFICATION: Create a class Geek that models a Geek.
// FOR: CSE 110- Lab #6
// TIME SPENT: 3 hours
//-----------------------------------------------------------*/

public class Geek {
	//instance variables
	private String name;
	private int numQuestions;
	
	//init Constructor
	public Geek(String name, int numQuestions)
	{
		numQuestions = 0;
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public int getNumberOfQuestions()
	{
		return numQuestions;
	}
	
	public boolean isEven(int num1, int num2)
	{
		numQuestions++;
		int sum = num1 + num2;
		if (sum%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public int sum(int num1, int num2)
	{
		int sum = 0;
		if (num1 == num2)
		{
			sum = num1;
			return sum;
		}
		else if (num1 > num2)
		{
			sum = num1;
			num1 = num2;
			num2 = sum;
			sum = 0;
		
		}
		
		while (num1 <= num2)
		{
			sum += num1;
			num1++;
		}
		return sum;
	}
	
	public boolean leapYear(int year)
	{
		numQuestions++;
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
