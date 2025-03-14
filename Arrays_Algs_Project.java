import java.util.ArrayList;

public class Algorithms_Project {

	public static void main(String[] args) 
	{
		int [] myArray = {5, 6, 9, 14, 17, 13, 3, 4, 86, 33, 51, 22};
		int [] myArrayTwo = {2, 0, 8, 4, 10, 2, 12};
		int [] myArrayThree = {3, 2, 0, 6, 7, 8, 8, 8, 2};
		int [] myArrayFour = {4, 5, 6, 9, 5, 5, 8, 2};
		int [] myArrayFive = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] myArraySix = {2, 3, 5, 1, 0};
		
		System.out.println(taskOne(myArray));
		
		System.out.println(taskTwo(myArray));
		
		System.out.println(taskThree(myArrayTwo));
		
		System.out.println(taskFour(myArrayTwo));
		
		printArr((taskFive(myArrayFour)));
		
		System.out.println();
		System.out.println(taskSix(myArrayThree));
		
		System.out.println(taskSeven(myArrayTwo, 2));
		
		printArr((taskEight(myArrayFive)));
		
		System.out.println();
		printArr((taskNine(myArraySix)));
		
		System.out.println();
		printArr(taskTen(myArrayTwo));
	}
	
	/*
	 * Method that prints out an array
	 */
	public static void printArr(int[] nums)
	{	
		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i]);
			System.out.print(", ");
		}
	}
	
	/*
	 * This method returns the smallest number in the array
	 */
	public static int taskOne(int [] nums)
	{
		System.out.print("Task 1: ");
		
		//Makes a variable for the first element in the array 
		int min = nums[0];
		
		//for loop that checks every element in the array
		for (int i = 0; i < nums.length; i++)
		{
			//if the first number in the array is greater than the number the for loop is checking
			if (min > nums[i])
			{
				//Sets the number the for loop is currently checking to the "min" variable, storing a new lowest number
				min = nums[i];
			}
		}
		
		//returns min, which is the lowest number in the array by the time the for loop is done checking
		return min;
	}
	
	/*
	 * This method returns the index of the smallest number in the array
	 */
	public static int taskTwo(int [] nums) 
	{
		System.out.print("Task 2: ");
		
		//Does the same thing as the "min" variable in taskOne
		int min = nums[0];
		
		//Makes an int that will represent the index for the lowest number in the array
		int index = 0;
		
		//Does the same thing as the for loop in taskOne
		for (int i = 0; i < nums.length; i++)
		{
			//Does the same thing for the if statement in taskOne
			if (min > nums[i])
			{
				//Also sets the number the for loop is checking to the "min" variable, just like taskOne
				min = nums[i];
				
				//Makes the index equal i because the "i" variable represents the index of the element the for loop is checking
				index = i;
			}
		}
		
		return index;
	}
	
	/*
	 * This method returns the average of all numbers in an array
	 */
	public static double taskThree (int [] nums)
	{
		System.out.print("Task 3: ");
		
		double sum = 0;
		
		//for loop that goes through every number in the array
		for (int i = 0; i < nums.length; i++)
		{	
			//Takes the sum variable and adds i to it
			sum += nums[i];
		}
		
		//returns the average by dividing sum by the amount of numbers in the array
		return sum/nums.length;
	}
	
	
	 /*
	  * This method returns true if all numbers in an array are even, and false otherwise
	  */
	public static boolean taskFour (int [] nums)
	{
		System.out.print("Task 4: ");
		
		//int that will keep track of how many times an even number shows up in an array
		int count = 0;
		
		//for loop that checks every number in an array
		for (int i = 0; i < nums.length; i++)
		{
			//if a number's modulus is equal to 0, meaning that it's an even number
			if (nums[i] % 2 == 0)
			{
				//Adds 1 to the "count" variable
				count++;
			}
			
			//if the "count" variable is equal to the length of the array
			if (count == nums.length)
			{
				//returns true, because it means that every number in the array is even
				return true;
			}		
		}
		
		//returns false otherwise
		return false;
	}
	
	
	/*
	 * This method changes two consecutive 5's to 0's if an array has them
	 */
	public static int [] taskFive (int [] nums)
	{
		System.out.print("Task 5: ");
		
		//for loop that checks every number in the array
		for (int i = 0; i < nums.length-1; i++)
		{
			//if the number the loop is currently checking is equal to 5 and the number after it is also equal to 5
			if (nums[i] == 5 && nums[i+1] == 5)
			{
				//Sets both of those elements to 0's
				nums[i] = 0;
				nums[i+1] = 0;
			}
		}
		
		//returns the altered array
		return nums;
	}
	
	/*
	 * This method returns true if any number in an array shows up three times in a row
	 */
	public static boolean taskSix (int [] nums)
	{
		System.out.print("Task 6: ");
		
		//for loop that checks every number in the array. Stops at the third to last element because it would give an out of bounds error
		for (int i = 0; i < nums.length-2; i++)
		{
			//if there are three consecutive numbers at any point
			if (nums[i] == nums[i+1] && nums[i] == nums[i+2])
			{
				return true;
			}
			
		}
		
		//returns false if there isn't an occurrence of three consecutive numbers
		return false;
	}
	
	/*
	 * This method returns how many times a certain number shows up in an array
	 */
	public static int taskSeven (int [] nums, int x)
	{
		System.out.print("Task 7: ");
		
		//Keeps track of how many times the number shows up in the array
		int count = 0;
		
		//for loop that goes through every number in the array
		for (int i = 0; i < nums.length; i++)
		{
			//Adds 1 to the count variable if the number that the for loop is checking is equal to the passed number
			if (nums[i] == x)
			{
				count++;
			}
		}
		
		//returns the amount of times the passed number shows up in the array
		return count;
	}
	
	/*
	 * This method alters an array and prints a backwards version
	 */
	public static int [] taskEight (int [] nums)
	{
		System.out.print("Task 8: ");
		
		//for loop that checks every number in the array until it reaches the midpoint element
		for (int i = 0; i < nums.length-(nums.length/2); i++)
		{	
			//Swaps an element with the opposite element on the other side of the array
			int temp = nums[i];
			nums [i] = nums[nums.length-i-1];
			nums[nums.length-i-1] = temp;
		}
		
		return nums;
	}
	
	/*
	 * This method shifts every element in an array to the right
	 */
	public static int [] taskNine (int [] nums)
	{
		System.out.print("Task 9: ");
		
		//Makes an array that is the same length as the original array
		int [] copyArr = new int [nums.length];
		
		//Makes the elements in the copied array the same as the original array. The copied array will be used
		//to store the original elements so the original array will know what numbers to alter
		for (int i = 0; i < nums.length; i++) 
		{
			copyArr[i] = nums[i];
		}
		
		//int that represents the last element in the array
		int temp = nums[nums.length-1];
		
		//Makes the number after the currently checked number equal the current number in the copied array.
		//This gives off the "shifting" effect, with the original array "grabbing" information from the copied
		//array (which has its exact same elements) and alters itself
		//TLDR: makes a number equal the number after it by "grabbing" or "comparing" itself to the copied array
		for (int i = 0; i < nums.length-1; i++)
		{
			nums[i+1] = copyArr[i];
		}
		
		//Makes the "temp" variable (last element in the array) the first element in the array
		nums[0] = temp;
		
		//returns the altered array
		return nums;
	}
	
	/*
	 * This method sorts an array using selection sort
	 */
	public static int [] taskTen (int [] nums)
	{
		System.out.print("Task 10: ");
		
		boolean sort = false;
		int counter = 0;
		
		while (sort == false)
		{
			sort = true;
			
			for (int i = counter; i < nums.length; i++)
			{
				//if the number at index "counter" is greater than the number next to it
				if (nums[counter] >= nums[i])
				{
					//Swaps the number at index "counter" with the 
					int temp = nums[i];
					nums [i] = nums[counter];
					nums[counter] = temp;
					
					sort = false;
				}
			}
			
			//Adds 1 to counter; makes the for loop start at the next index and leaves the previous index alone 
			//because the correct number has just been put there
			counter++;
		}
		
		//returns the altered array
		return nums;
	}
	
}
