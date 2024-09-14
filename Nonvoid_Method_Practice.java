
public class Nonvoid_Method_Practice {

	public static void main(String[] args) {
		// TASK 1: Calls stateName, stateHairStyle, and stateFavoriteFood
			System.out.println(stateName());
			System.out.println(stateEyeColor());
			System.out.println(stateFavoriteFood());
			System.out.println();
			
		//TASK 2: Calls the printCircleStats method
			double radius = 8.0;
			System.out.println("The diameter is " + calcDiameter(radius));
			System.out.println();
				
		//TASK 3: Calls the printMathStuffs method
			int x = 4;
			int y = 5;
			System.out.print("The sum is " + findSum(x, y));
		}
			
		//TASK 1: This method states my name
		public static String stateName()
		{
			return ("My name is Jayven Pabo");
		}
			
		//TASK 1: This method states my eye color
		public static String stateEyeColor()
		{
			return ("My eye color is brown");
		}
		
		//TASK 1: This method states my hair style
		public static String stateHairStyle()
		{
			return ("My hair style is a side comb");
		}
		
		//TASK 1: This method states my best friend's name
		public static String stateBestFriend()
		{
			return ("My best friends are Cassidy");
		}
		
		//TASK 1: This method states my favorite food
		public static String stateFavoriteFood()
		{
			return ("My favorite food is pasta");
		}
		
		//TASK 2: This method declares radius as a double, and calculates the diameter, circumference, and area of a circle
		public static double calcDiameter(double radius)
		{
			double pi=3.14;
			double diameter=2*radius;
			double circumference=2*pi*radius;
			double area=pi*radius*radius;
			return (diameter);
		}
		
		//TASK 3: This method calculates the sum, difference, product, quotient, and modulo of two numbers
		public static int findSum(int x, int y)
		{
			int sum=x+y;
			int dif=x-y;
			int prod=x*y;
			int quo=x/y;
			int remain=x%y;
			return (sum);

	}

}
