/*-------------------------------------------------------------------------
// AUTHOR: Samantha Paulot
// FILENAME: Arrays.java
// SPECIFICATION: ARRAY PROCESSING METHODS.
// FOR: CSE 110- Lab #8
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/
import java.util.Random;
public class Arrays {
	
	//Instance Variables
	private int count;
	int[] array;
	
	//Constructors
	public Arrays(int size){
		array = new int[size];//set array size to size
		count = size;
		//generate random values
		Random rand = new Random();
		for (int i = 0; i < count; i++) {
		array[i] = (rand.nextInt(10));
		}
		
	}
	
	public Arrays(int[] arr){
		int[] array = arr;
		count = array.length;
	}
	
	//findMin
	public int findMin() {
		int min = array[0]; // Set min to the first element
		for (int i = 1; i < count; i++) {
		// Reassign min if there is a smaller element
		if (array[i] < min) {
		min = array[i];
		}
		}
		return min; // Return the smallest element
		}
	
	//findMax
	public int findMax() {
		int max = array[0];
		for (int i = 1; i < count; i++){
			int maximum = array[i];
			if (maximum > max)
				max = maximum;
		}
		return max;
	}
	
	//calcSum
	private int calcSum() {
		int sum = 0;
		for (int i = 0; i < count; i++){
			sum += array[i];
		}
		return sum;
	}
	
	//calcAverage
	public double calcAverage() {
		double average = calcSum() / array.length;
		return average;
	}
	
	//toString
	public String toString() {
		String output = "[ ";
		for (int i = 0; i < count; i++) {
		output += array[i];
		if (i != count - 1) {
		output += ", ";
			}
		}
		return output + " ]";
		}
	
	
}//end of class
