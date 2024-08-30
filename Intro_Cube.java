/*
 * 1) Declare a side length as an int
 * 2) Calculate its surface area
 * 3) Calculate its volume volume
 * 4) Print its values as doubles in a sentence
 * 5) Well documented
 * 
 * This code prints out the surface area and volume of a cube with a 
 * side length that can be decided by the user.
 */

public class Intro_Cube {

	public static void main(String[] args) {
		//Surface Area Code
		double side=4.0;
		double surface=6*(side*side);
		double surfacearea=surface;
		
		//Volume Code
		double volume=side*side*side;
		double volfinal=volume;
		
		//Sentences with values as doubles
		System.out.println("The side length of a cube is " + (int) side);
		System.out.println("The surface area of the cube is " + (int) surfacearea);
		System.out.print("The volume of the cube is " + (int) volfinal);
	}

}
