public class Methods_Intro_Practice {

	public static void main(String[] args) {
		// TASK 1: Calls stateName, stateHairStyle, and stateFavoriteFood
		stateName();
		stateHairStyle();
		stateFavoriteFood();
		
		//TASK 2: Calls the printCircleStats method
		printCircleStats(5.0);
		
		//TASK 3: Calls the printMathStuffs method
		printMathStuffs(5, 4);
	}
	
	//TASK 1: This method states my name
	public static void stateName()
	{
		System.out.println("My name is Jayven Pabo");
	}
	
	//TASK 1: This method states my eye color
	public static void stateEyeColor()
	{
		System.out.println("My eye color is brown");
	}
	
	//TASK 1: This method states my hair style
	public static void stateHairStyle()
	{
		System.out.println("My hair style is a side comb");
	}
	
	//TASK 1: This method states my best friend's name
	public static void stateBestFriend()
	{
		System.out.println("My best friends are Cassidy");
	}
	
	//TASK 1: This method states my favorite food
	public static void stateFavoriteFood()
	{
		System.out.println("My favorite food is pasta");
	}
	
	//TASK 2: This method declares radius as a double, and calculates the diameter, circumference, and area of a circle
	public static void printCircleStats(double radius)
	{
		double pi=3.14;
		double diameter=2*radius;
		double circumference=2*pi*radius;
		double area=pi*radius*radius;
		
		System.out.println("The radius of a circle is " + radius + ". This means that the diameter is " + diameter + ", the circumference is " + circumference + ", and the area is " + area + ".");
	}
	
	//TASK 3: This method calculates the sum, difference, product, quotient, and modulo of two numbers
	public static void printMathStuffs(int x, int y)
	{
		int sum=x+y;
		int dif=x-y;
		int prod=x*y;
		int quo=x/y;
		int remain=x%y;
		System.out.print("The two numbers are " + x + " and " + y + ". The sum is " + sum + ", the difference is " + dif + ", the product is " + prod + ", the quotient is " + quo + ", and the modulo is " + remain + ".");
	}
	
}
