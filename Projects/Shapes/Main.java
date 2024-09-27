
/**
 * This is the main method which prints the characteristics of six different shapes. For each shape,
 * a set of three are printed with it, making 18 total shapes being printed with their 
 * characteristics.
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * This code prints the title for the Circles section, the first set of shapes.
		 * The circle is also the tutorial shape for this assignment.
		 */
		String shape = Circle.getShape();
		System.out.println(shape);
		
		/*
		 * This prints the title for Circle 1
		 */
		System.out.println("Circle 1");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new circle with a new radius
		Circle circOne = new Circle (3.0);
		
		//Prints the radius
		System.out.println(circOne.getRadius());
		
		//Calls and prints the diameter
		System.out.print("Diameter = ");
		System.out.println(circOne.getDiameter());
		
		//Calls and prints the circumference
		System.out.print("Circumference = ");
		System.out.println(circOne.getCircumference());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(circOne.getArea());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Circle 1 code
		 */
		
		
		/*
		 * This prints the title for Circle 2
		 */
		System.out.println("Circle 2");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new circle with a new radius
		Circle circTwo = new Circle (20.0);
		
		//Prints the radius
		System.out.println(circTwo.getRadius());
		
		//Calls and prints the diameter
		System.out.print("Diameter = ");
		System.out.println(circTwo.getDiameter());
		
		//Calls and prints the circumference
		System.out.print("Circumference = ");
		System.out.println(circTwo.getCircumference());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(circTwo.getArea());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Circle 2 code
		 */
		
		
		/*
		 * This prints the title for Circle 3
		 */
		System.out.println("Circle 3");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new circle with a new radius
		Circle circThree = new Circle (-4.0);
		
		//Prints the radius
		System.out.println(circThree.getRadius());
		
		//Calls and prints the diameter
		System.out.print("Diameter = ");
		System.out.println(circThree.getDiameter());
		
		//Calls and prints the circumference
		System.out.print("Circumference = ");
		System.out.println(circThree.getCircumference());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(circThree.getArea());
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * This marks the end of the Circle 3 code
		 */
		
		
		/*
		 * This code starts off the next section of shapes: spheres. This code prints the title for
		 * the Spheres section.
		 */
		String shapeTwo = Sphere.getShape();
		System.out.println(shapeTwo);
		
		/*
		 * This prints the title for Sphere 1
		 */
		System.out.println("Sphere 1");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new sphere with a new radius
		Sphere sphereOne = new Sphere (7.0);
		
		//Prints the radius
		System.out.println(sphereOne.getRadius());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(sphereOne.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(sphereOne.getVolume());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Sphere 1 code
		 */
		
		
		/*
		 * This code prints the title for Sphere 2
		 */
		System.out.println("Sphere 2");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new sphere with a new radius
		Sphere sphereTwo = new Sphere (11.0);
		
		//Prints the radius
		System.out.println(sphereTwo.getRadius());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(sphereTwo.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(sphereTwo.getVolume());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Sphere 2 code
		 */
		
		
		/*
		 * This prints the title for Sphere 3
		 */
		System.out.println("Sphere 3");
		
		//Prints the title for radius
		System.out.print("Radius = ");
		
		//Makes a new sphere with a new radius
		Sphere sphereThree = new Sphere (-2.0);
		
		//Prints the radius
		System.out.println(sphereThree.getRadius());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(sphereThree.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(sphereThree.getVolume());
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * This marks the end of the Sphere 3 code
		 */
		
		
		/*
		 * This code starts off the third section of shapes: cubes, and also prints the title for the
		 * section.
		 */
		String shapeThree = Cube.getShape();
		System.out.println(shapeThree);
		
		/*
		 * This prints the title for Cube 1
		 */
		System.out.println("Cube 1");
		
		//Prints the title for side
		System.out.print("Side = ");
		
		//Makes a new cube with a new side
		Cube cubeOne = new Cube (4.0);
		
		//Prints the side
		System.out.println(cubeOne.getSide());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(cubeOne.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(cubeOne.getVolume());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Cube 1 code
		 */
		
		
		/*
		 * This prints the title for Cube 2
		 */
		System.out.println("Cube 2");
		
		//Prints the title for side
		System.out.print("Side = ");
		
		//Makes a new cube with a new side
		Cube cubeTwo = new Cube (9.0);
		
		//Prints the side
		System.out.println(cubeTwo.getSide());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(cubeTwo.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(cubeTwo.getVolume());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Cube 2 code
		 */
		
		
		/*
		 * This prints the title for Cube 3
		 */
		System.out.println("Cube 3");
		
		//Prints the title for side
		System.out.print("Side = ");
		
		//Makes a new cube with a new side
		Cube cubeThree = new Cube (-3.0);
		
		//Prints the side
		System.out.println(cubeThree.getSide());
		
		//Calls and prints the surface area
		System.out.print("Surface Area = ");
		System.out.println(cubeThree.getSurfaceArea());
		
		//Calls and prints the volume
		System.out.print("Volume = ");
		System.out.println(cubeThree.getVolume());
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * This marks the end for the Cube 3 code 
		 */
		
		
		/*
		 * This code starts the fourth section of shapes: rectangles, and also prints the title for 
		 * the section.
		 */
		String shapeFour = Rectangle.getShape();
		System.out.println(shapeFour);
		
		//This prints the title for Rectangle 1
		System.out.println("Rectangle 1");
		
		//Prints the title for length
		System.out.print("Length = ");
		
		//Makes a new rectangle with a new length and width
		Rectangle rectOne = new Rectangle (2.0, 6.0);
		
		//Prints the length
		System.out.println(rectOne.getLength());
		
		//Prints the title for width and the width itself
		System.out.print("Width = ");
		System.out.println(rectOne.getWidth());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(rectOne.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(rectOne.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end for the Rectangle 1 code
		 */
		
		
		/*
		 * This prints the title for Rectangle 2
		 */
		System.out.println("Rectangle 2");
		
		//Prints the title for length
		System.out.print("Length = ");
		
		//Makes a new rectangle with a length and width that are equal to each other
		Rectangle rectTwo = new Rectangle (4.0);
		
		//Prints the length
		System.out.println(rectTwo.getLength());
		
		//Prints the title for width and calls the width itself
		System.out.print("Width = ");
		System.out.println(rectTwo.getWidth());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(rectTwo.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(rectTwo.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end for the Rectangle 2 code
		 */
		
		
		/*
		 * This prints the title for Rectangle 3
		 */
		System.out.println("Rectangle 3");
		
		//Prints the title for length
		System.out.print("Length = ");
		
		//Makes a new rectangle with a new length and new width
		Rectangle rectThree = new Rectangle (-5.0, 3.0);
		
		//Prints the length
		System.out.println(rectThree.getLength());
		
		//Prints the title for width and prints the width itself
		System.out.print("Width = ");
		System.out.println(rectThree.getWidth());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(rectThree.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(rectThree.getPerimeter());
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * This marks the end of the Rectangle 3 code
		 */
		
		
		/*
		 * This starts the fifth set of shapes: squares, and also prints the title for the section.
		 */
		String shapeFive = Square.getShape();
		System.out.println(shapeFive);
		
		//This prints the title for Square 1
		System.out.println("Square 1");
		
		//This prints the title for the side
		System.out.print("Side = ");
		
		//This makes a new square with a new side length
		Square squareOne = new Square (7.0);
		
		//Prints the side length
		System.out.println(squareOne.getSide());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(squareOne.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(squareOne.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end for the Square 1 code
		 */
		
		
		/*
		 * This prints the title for Square 2
		 */
		System.out.println("Square 2");
		
		//Prints the title for the side length
		System.out.print("Side = ");
		
		//Makes a new square with a new side length
		Square squareTwo = new Square (12.0);
		
		//Prints the side length
		System.out.println(squareTwo.getSide());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(squareTwo.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(squareTwo.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the Square 2 code
		 */
		
		
		/*
		 * This prints the title for Square 3
		 */
		System.out.println("Square 3");
		
		//Prints the title for side
		System.out.print("Side = ");
		
		//Makes a new square with a new side length
		Square squareThree = new Square (-6.0);
		
		//Prints the side length
		System.out.println(squareThree.getSide());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(squareThree.getArea());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(squareThree.getPerimeter());
		
		//Used for spacing
		System.out.println();
		System.out.println();
		
		/*
		 * This marks the end of the Square 3 code
		 */
		
		
		/*
		 * This starts the sixth and final set of shapes: right triangles, as well as prints the title
		 * for the section.
		 */
		String shapeSix = Right_Triangle.getShape();
		System.out.println(shapeSix);
		
		
		/*
		 * This prints the title for Triangle 1
		 */
		System.out.println("Triangle 1");
		
		//Prints the title for leg A
		System.out.print("Leg A = ");
		
		//Makes a new triangle with a new leg A and new leg B
		Right_Triangle triangleOne = new Right_Triangle (5.0, 8.0);
		
		//Prints the length of leg A 
		System.out.println(triangleOne.getLegOne());
		
		//Calls and prints the length of leg B
		System.out.print("Leg B = ");
		System.out.println(triangleOne.getLegTwo());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(triangleOne.getArea());
		
		//Calls and prints the hypotenuse
		System.out.print("Hypotenuse = ");
		System.out.println(triangleOne.getHypotenuse());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(triangleOne.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the code for Triangle 1
		 */
		
		
		/*
		 * This prints the title for Triangle 2
		 */
		System.out.println("Triangle 2");
		
		//Prints the title for leg A
		System.out.print("Leg A = ");
		
		//Makes a new triangle with a new leg A and new leg B
		Right_Triangle triangleTwo = new Right_Triangle (10.0, 4.0);
		
		//Prints the length of leg A
		System.out.println(triangleTwo.getLegOne());
		
		//Calls and prints the length of leg B
		System.out.print("Leg B = ");
		System.out.println(triangleTwo.getLegTwo());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(triangleTwo.getArea());
		
		//Calls and prints the hypotenuse
		System.out.print("Hypotenuse = ");
		System.out.println(triangleTwo.getHypotenuse());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(triangleTwo.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * This marks the end of the code for Triangle 2
		 */
		
		
		/*
		 * This prints the title Triangle 3
		 */
		System.out.println("Triangle 3");
		
		//Prints the title for leg A
		System.out.print("Leg A = ");
		
		//Makes a new triangle with a new leg A and new leg B
		Right_Triangle triangleThree = new Right_Triangle (-6.0, 13.0);
		
		//Prints the length of leg A
		System.out.println(triangleThree.getLegOne());
		
		//Calls and prints the length of leg B
		System.out.print("Leg B = ");
		System.out.println(triangleThree.getLegTwo());
		
		//Calls and prints the area
		System.out.print("Area = ");
		System.out.println(triangleThree.getArea());
		
		//Calls and prints the hypotenuse
		System.out.print("Hypotenuse = ");
		System.out.println(triangleThree.getHypotenuse());
		
		//Calls and prints the perimeter
		System.out.print("Perimeter = ");
		System.out.println(triangleThree.getPerimeter());
		
		//Used for spacing
		System.out.println();
		
		/*
		 * Prints Circle 1 and Circle 2 into a String. This is used as a shorter way to print the
		 * characteristics of a shape.
		 */
		System.out.println(circOne.toString());
		System.out.print(circTwo.toString());

	}

}
