
/**
 * This is the Sphere class, which has the code for the math of a sphere's characteristics.
 */
public class Sphere {
	
	//Attributes for a sphere
	final double pi = 3.14;
	double radius;
	
	/**
	 * Constructor for a sphere.
	 * @param r
	 */
	public Sphere (double r)
	{
		radius = r;
	}
	
	//Functionalities
	
	/**
	 * This method gives you the radius of a sphere.
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	/**
	 * This method gives you the surface area of a sphere.
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		return 4*pi*(radius*radius);
	}
	
	/**
	 * This method gives you the volume of a sphere.
	 * @return volume
	 */
	public double getVolume()
	{
		return (4/3)*pi*(radius*radius*radius);
	}
	
	/**
	 * This method gives you the title of the Spheres section.
	 * @return "SPHERES"
	 */
	public static String getShape()
	{
		return "SPHERES";
	}
	
}
