import java.util.Scanner;

public class Strings_Practice {
	
	static Scanner gameReader = new Scanner (System.in);

	public static void main(String[] args) 
	{
		//taskOne();
		taskTwo();
	}
	
	//Method for Task 1
	public static void taskOne()
	{
		boolean test = true;
		int count = 0;
		while (test)
		{
			String userInput = new String (gameReader.next());
			
			//Sets test to false if the user types "stop," which stops the loop
			if (userInput.equals("stop"))
			{
				test = false;
			}
			
			//Adds 1 to count, keeping track of the number of loops
			count++;
			
			//Prints the number that the loop is on and what string the user typed
			System.out.println(count + " " + userInput);
		}
	}
	
	//Method for Task 2
	public static void taskTwo()
	{	
		//Used for spacing
		System.out.println();
		
		//Makes a new circle by calling on the Circle class
		Circle circOne = new Circle (4.0);
	
		//Tells the user what the starting radius of the circle is
		System.out.println("The radius of a circle is " + circOne.getRadius());
		
		//for loop that starts at 1, and keeps on adding to it in increments until it reaches 5
		for (int i = 1; i <= 5; i++)
		{
			//Opens the scanner for the user to type a double
			double num = gameReader.nextDouble();
			
			//Makes a variable called "sum," which is the sum of the radius of the circle and the number that is typed by the user
			double sum = circOne.getRadius() + num;
			
			//Prints "sum"
			System.out.println(sum);
			
			//Sets "sum" as the new radius for the circle and starts the process over again until the fifth number is typed
			circOne.setRadius(sum);
		}
	}

}
