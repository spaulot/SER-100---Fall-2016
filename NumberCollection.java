import java.util.Arrays;

public class NumberCollection {
	
	//variables to be initialized
	private int count;
	private int arraySize;
	
	//initializing array numberArray
	int[] numberArray;
	
	//constructor for new int array with a size of arraySize
	public NumberCollection(int arraySize)
	{
		this.arraySize = arraySize;
		count = 0;
		numberArray = new int[arraySize];
	}
	
	//return index of number specified by parameter
	private int indexOf(int searchingNum)
	{
		int index = -1;
		int parameter = searchingNum;
		for (int i = 0; i < numberArray.length; i++)
		{
		if (numberArray[i] == parameter)
			index = i;
			break;
		}
		return index;		
	}
	
	public boolean addNumber(int numberToAdd)
	{
		for (int i = 0; i < numberArray.length; i++) 
			if (numberArray[i] == numberToAdd) 
				return false;

		count++;
		
		if (count == numberArray.length + 1)
		{	
			// if needed increase size of array
			int[] temp = new int[numberArray.length + 1];

			//transfer values from old array to new
			for (int i1 = 0; i1 < numberArray.length; i1++)
				temp[i1] = numberArray[i1];

			//new array
			numberArray = temp;
		}

		//add new value to the new array
		numberArray[count - 1] = numberToAdd;
		return true;
	}
	
	public int findMax()
	{
		int max = numberArray[0];
		for (int i = 0; i < numberArray.length; i++)
		{

			int maximum = numberArray[i];
			if (maximum > max)
				max = maximum;
		}
		return max;
	}
	
	public int findMin()
	{
		int min = numberArray[0];
		for (int i = 0; i < numberArray.length; i++)
		{

			int minimum = numberArray[i];
			if (minimum < min)
				min = minimum;
		}
		return min;
	}
	
	public int computeSum()
	{
		int total = 0;
		for (int element: numberArray)
		{
			total = total + element;
		}
		return total;
	}
	
	public String toString()
	{
		String string = "";
		System.out.print("{");
		for ( int i = 0; i < numberArray.length; i++)
		{
			//if the value in that array slot is not the last,
			//print the value + a comma
			if (i < numberArray.length - 1){
			System.out.print(numberArray[i] + ", ");
			}
			//when at last value in array
			//print a bracket instead of a comma
			if (i == numberArray.length - 1)
			{
				System.out.print(numberArray[i] + "}");
			}
		}
		return string;
	}
	
	
}//end of class
