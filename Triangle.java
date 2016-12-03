
public class Triangle {
	private int side1, side2, side3;

	public Triangle (int s1, int s2, int s3)
	{
		side1 = s1;
		side2 = s2;
		side3 = s3;		
	}//constructor for Triangle sides
	
	private int largest()
	{
		int  max = side1;

	      if (side2 > max)
	         max = side2;
	      if (side3 > max)
	         max = side3;

	    return max;
	}//constructor to assign a side to "largest"
	
	private int shortest() 
	{
		  int  min = side1;

	      	if (side2 < min)
	         min = side2;
	      	if (side3 < min)
	         min = side3;

	      return min;
	 }//constructor to assign a side to "smallest"
	
	public boolean is_equilateral()
	{
		int longest_side, shortest_side;

	      longest_side = largest();
	      shortest_side = shortest();

	      return (shortest_side == longest_side);
	}//check for equilateral triangle
	
	public boolean is_scalene()
	{
		if ((side1 != side2) && (side2 != side3) && (side1 != side3))
			return true;
		else
			return false;
	}//check for scalene triangle
	
	public boolean is_isosceles()
	{
		if ((side1 == side2 && side2 != side3) || 
				(side1 == side3 && side1 != side2) || 
				(side2 == side3 && side2 != side3) || 
				(side1 == side2 && side2 == side3))
			return true;
		else
			return false;	
	}//check for isosceles triangle
	
	public String toString(){
		return side1 + " " + side2 + " " + side3;
	}
}//end of class
