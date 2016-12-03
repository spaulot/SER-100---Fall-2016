/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Door.java
// SPECIFICATION: Backbone of Lab5; create object Door.
// FOR: CSE 110- Lab #5
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
public class Door 
{
//instance variables
	private String name;
	private String state;
	
	//constructors to be filled in with method later
	public Door (String doorName, String doorState)
	{
		name = doorName;
		state = doorState;
	}
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public void setName(String doorName) {
		name = doorName;
	}
	public void setState(String doorState) {
		state = doorState;
	}
	public void open() {
		state = "open";
	}
	public void close() {
		state = "closed";
	}
}
