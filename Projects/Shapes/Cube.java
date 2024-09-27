
/**
 * This is the Cube class, which gives you the code for the math of a cube's characteristics.
 */
public class Cube {
	//Attributes
	double side;
	
	/**
	 * Constructor for a cube
	 * @param s
	 */
	public Cube (double s)
	{
		side = s;
	}
	
	//Functionality
	/**
	 * This method gives you the side for a cube.
	 * @return side
	 */
	public double getSide()
	{
		return side;
	}
	
	/**
	 * This method gives you the surface area of a cube.
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		return 6*(side*side);
	}
	
	/**
	 * This method gives you the volume of a cube.
	 * @return volume
	 */
	public double getVolume()
	{
		return side*side*side;
	}
	
	/**
	 * This method gives you the title for the Cubes section.
	 * @return "CUBES"
	 */
	public static String getShape()
	{
		return "CUBES";
	}

}
