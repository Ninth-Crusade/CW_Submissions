
/**
 * This is the Rectangle class, which has the code for the math of a rectangle's characteristics.
 */
public class Rectangle {
	
	//Attributes for a rectangle
	double length;
	double width;
	
	/**
	 * Constructor for a rectangle with a length and width of different sizes.
	 * @param l
	 * @param w
	 */
	public Rectangle (double l, double w)
	{
		length = l;
		width = w;
	}
	
	/**
	 * Constructor for a rectangle with a length and width of equal sizes.
	 * @param s
	 */
	public Rectangle (double s)
	{
		length = s;
		width = s;
	}
	
	//Functionality
	/**
	 * This method gives you the length of a rectangle.
	 * @return width
	 */
	public double getLength()
	{
		return length;
	}
	
	/**
	 * This method gives you the width of a rectangle.
	 * @return width
	 */
	public double getWidth()
	{
		return width;
	}
	
	/**
	 * This method gives you the area of a rectangle.
	 * @return area
	 */
	public double getArea()
	{
		return length*width;
	}
	
	/**
	 * This method gives you the perimeter of a rectangle.
	 * @return perimeter
	 */
	public double getPerimeter()
	{
		return 2*(length + width);
	}
	
	/**
	 * This method gives you the title of the Rectangles section.
	 * @return "RECTANGLES"
	 */
	public static String getShape()
	{
		return "RECTANGLES";
	}

}
