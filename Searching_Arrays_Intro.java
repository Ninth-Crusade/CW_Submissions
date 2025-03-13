
public class Searching_Arrays_Intro {

	public static void main(String[] args) 
	{
		int [] myArray = {1, 6, 2, 9, 0, 4, 5, 4, 11, 23, 96, 4, 17, 9, 4};
		
		System.out.println(checkFor4(myArray));
		System.out.println(countFor4(myArray));
		System.out.println(checkForFour4(myArray));
	}
	
	/*
	 * This method checks if there is a 4 in an array
	 */
	public static boolean checkFor4(int [] arr)
	{
		//boolean that will represent if there's a 4 in an array
		boolean isFound = false;
		
		//for loop that goes through every element in the array
		for (int i = 0; i < arr.length; i++)
		{
			//if the number the for loop is currently checking is equal to 4
			if (arr[i] == 4)
			{
				//Sets the "isFound" boolean to true 
				isFound = true;
			}
		}
		
		//returns the isFound boolean after the process of checking if there's a 4
		return isFound;
	}
	
	/*
	 * This method counts how many 4's are in an array
	 */
	public static int countFor4(int [] arr)
	{
		//int that will store the amount of times 4 shows up in the array
		int count = 0;
		
		//for loop that checks every number in the array
		for (int i = 0; i < arr.length; i++)
		{
			//Adds 1 to "count" if the number the loop is currently checking is equal to 4
			if (arr[i] == 4)
			{
				count++;
			}
		}
		
		//returns "count," now having kept track of the amount of times 4 shows up in the array
		return count;
	}
	
	/*
	 * This method checks if there are exactly four 4's in an array
	 */
	public static boolean checkForFour4(int [] arr)
	{
		//int that stores the amount of times 4 shows up in the array
		int counter = 0;
		
		//for loop that checks every number in the array
		for (int i = 0; i < arr.length; i++) 
		{
			//Adds 1 to counter if the number the loop is currently checking is equal to 4
			if (arr[i] == 4)
			{
				counter++;
			}
		}
		
		//returns true if "counter" is equal to 4, meaning that the number 4 showed up four times
		if (counter == 4)
		{
			return true;
		}
		
		//returns false if "counter" isn't equal to 4, meaning that the number 4 didn't show up four times
		else
		{
			return false;
		}
		
	}

}
