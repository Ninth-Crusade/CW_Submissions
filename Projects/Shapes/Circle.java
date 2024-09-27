
/**
 * This is the Circle class, which has the code for the math a circle's characteristics.
 */
public class Circle {
	//Attributes
	private final double pi = 3.14;
	private double radius;
	
	/**
	 * Constructor for the circle class.
	 * @param r
	 */
	public Circle (double r)
	{
		radius = r;
	}
	
	/*
	Functionality
	Static means it doesn't depend on a specific object
	*/
	
	/**
	 * This method gives you the radius of the circle object.
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * This method gives you the diameter of the circle object.
	 * @return diameter
	 */
	public double getDiameter()
	{
		return 2*radius;
	}
	
	/**
	 * This method gives you the circumference of the circle object.
	 * @return circumference
	 */
	public double getCircumference()
	{
		return 2*pi*radius;
	}
	
	/**
	 * This method gives you the area of the circle.
	 * @return area
	 */
	public double getArea()
	{
		return pi*radius*radius;
	}

	/**
	 * This method gives you the title of the Circles section.
	 * @return "CIRCLES"
	 */
	public static String getShape()
	{
		return "CIRCLES";
	}
	
	/**
	 * This turns everything about the circle object into a String.
	 */
	public String toString()
	{
		return "This is a circle with a radius of " + radius + ", an area of " + getArea() + ", a circumference of " + getCircumference() + ", and a diameter of " + getDiameter(); 
	}
	
	public void setRadius(double r)
	{
		radius = r;
	}

}
