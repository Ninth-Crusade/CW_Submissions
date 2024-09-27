
/**
 * This is the Square class, which has the code for the math of a square's characteristics.
 */
public class Square {
	//Attributes
	double side;
	
	//Constructors
	/**
	 * Constructor for a square.
	 * @param s
	 */
	public Square (double s)
	{
		side = s;
	}
	
	//Functionality
	/**
	 * This method gives you the side for a square.
	 * @return side
	 */
	public double getSide()
	{
		return side;
	}
	
	/**
	 * This method gives you the area for a square.
	 * @return area
	 */
	public double getArea()
	{
		return side*side;
	}
	
	/**
	 * This method gives you the perimeter for a square.
	 * @return perimeter
	 */
	public double getPerimeter()
	{
		return 4*side;
	}
	
	/**
	 * This method gives you the title for the Squares section.
	 * @return "SQUARES"
	 */
	public static String getShape()
	{
		return "SQUARES";
	}

	public void setSide(double side) 
	{
		this.side = side;
	}

}
