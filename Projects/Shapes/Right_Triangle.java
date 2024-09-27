
/**
 * This is the Right Triangle class, which gives you the code for the math of a right triangle's
 * characteristics.
 */
public class Right_Triangle {
	//Attributes
	double legOne;
	double legTwo;
	
	/**
	 * Constructors for a right triangle.
	 * @param lOne
	 * @param lTwo
	 */
	public Right_Triangle (double lOne, double lTwo)
	{
		legOne = lOne;
		legTwo = lTwo;
	}
	
	//Functionality
	/**
	 * This method gives you the first leg of a right triangle.
	 * @return leg one
	 */
	public double getLegOne()
	{
		return legOne;
	}
	
	/**
	 * This method gives you the second leg of a right triangle.
	 * @return leg two
	 */
	public double getLegTwo()
	{
		return legTwo;
	}
	
	/**
	 * This method gives you the area of a right triangle.
	 * @return area
	 */
	public double getArea()
	{
		return (legOne * legTwo)/2;
	}
	
	/**
	 * This method gives you the hypotenuse of a right triangle.
	 * @return hypotenuse
	 */
	public double getHypotenuse()
	{
		double hypSquareRoot = (legOne * legOne) + (legTwo * legTwo);
		return Math.sqrt(hypSquareRoot);
		
	}
	
	/**
	 * This method gives you the perimeter of a right triangle.
	 * @return perimeter
	 */
	public double getPerimeter()
	{
		double hypSquareRoot = (legOne * legOne) + (legTwo * legTwo);
		return legOne + legTwo + Math.sqrt(hypSquareRoot);
	}
	
	/**
	 * This method gives you the title for the Right Triangles section.
	 * @return "RIGHT TRIANGLES"
	 */
	public static String getShape()
	{
		return "RIGHT TRIANGLES";
	}
	
}
