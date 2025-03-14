import java.util.ArrayList;

public class ArrayList_Algorithms_Project {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();
		
		list1.add(33);
		list1.add(9);
		list1.add(66);
		list1.add(34);
		list1.add(11);
		list1.add(5);
		list1.add(4);
		list1.add(72);
		list1.add(23);
		
		list2.add(2);
		list2.add(2);
		list2.add(9);
		list2.add(5);
		list2.add(5);
		list2.add(3);
		list2.add(3);
		list2.add(3);
		list2.add(8);
		
		list3.add(2);
		list3.add(8);
		list3.add(14);
		list3.add(66);
		list3.add(36);
		list3.add(90);
		
		list4.add(9);
		list4.add(3);
		list4.add(5);
		list4.add(1);
		list4.add(10);
		list4.add(6);
		
		System.out.println(taskOne(list1));
		
		System.out.println(taskTwo(list1));
		
		System.out.println(taskThree(list1));
		
		System.out.println(taskFour(list3));
		
		System.out.println(taskFive(list2));
		
		System.out.println(taskSix(list2));
		
		System.out.println(taskSeven(list2, 2));
		
		System.out.println(taskEight(list4));
		
		System.out.println(taskNine(list1));
		
		System.out.println(taskTen(list1));
	}
	
	/*
	 * Return the smallest number in the array list
	 */
	public static int taskOne(ArrayList<Integer> arr)
	{
		System.out.print("Task 1: ");
		
		//Makes a variable for the first element in the array list
		int min = arr.get(0);
		
		//for loop that checks every element in the array list
		for (int i = 0; i < arr.size(); i++)
		{
			//if the first number in the array list is greater than the number the for loop is checking
			if (min > arr.get(i))
			{
				//Sets the number the for loop is currently checking to the "min" variable, storing a new lowest number
				min = arr.get(i);
			}
		}
		
		//returns min, which is the lowest number in the array list by the time the for loop is done checking
		return min;
	}
	
	/*
	 * Return the index of the smallest number in the array list
	 */
	public static int taskTwo(ArrayList<Integer> arr) 
	{
		System.out.print("Task 2: ");
		
		//Does the same thing as the "min" variable in taskOne
		int min = arr.get(0);
		
		//Does the same thing as the for loop in taskOne
		for (int i = 0; i < arr.size(); i++)
		{
			//Does the same thing for the if statement in taskOne
			if (min > arr.get(i))
			{
				//Also sets the number the for loop is checking to the "min" variable, just like taskOne
				min = arr.get(i);
			}
		}
		
		return arr.indexOf(min);
	}
	
	/*
	 * Return the average of all numbers in the array list
	 */
	public static double taskThree (ArrayList<Integer> arr)
	{
		System.out.print("Task 3: ");
		
		double sum = 0;
		
		//for loop that goes through every number in the array list
		for (int i = 0; i < arr.size(); i++)
		{	
			//Takes the sum variable and adds i to it
			sum += arr.get(i);
		}
		
		//returns the average by dividing sum by the amount of numbers in the array list
		return sum/arr.size();
	}
	
	/*
	 * Returns true if all numbers in the array list are even
	 */
	public static boolean taskFour (ArrayList<Integer> arr)
	{
		System.out.print("Task 4: ");
		
		//int that will keep track of how many times an even number shows up in an array list
		int count = 0;
		
		//for loop that checks every number in an array list
		for (int i = 0; i < arr.size(); i++)
		{
			//if a number's modulus is equal to 0, meaning that it's an even number
			if (arr.get(i) % 2 == 0)
			{
				//Adds 1 to the "count" variable
				count++;
			}
			
			//if the "count" variable is equal to the length of the array list
			if (count == arr.size())
			{
				//returns true, because it means that every number in the array list is even
				return true;
			}		
		}
		
		//returns false otherwise
		return false;
	}
	
	/*
	 * Changes two consecutive 5's to 0's in an array list
	 */
	public static ArrayList<Integer> taskFive (ArrayList<Integer> arr)
	{
		System.out.print("Task 5: ");
		
		//for loop that checks every number in the array list
		for (int i = 0; i < arr.size()-1; i++)
		{
			//if the number the loop is currently checking is equal to 5 and the number after it is also equal to 5
			if (arr.get(i) == 5 && arr.get(i+1) == 5)
			{
				//Sets both of those elements to 0's
				arr.set(i, 0);
				arr.set(i+1, 0);
			}
		}
		
		//returns the altered array list
		return arr;
	}
	
	/*
	 * Return true if any number in the array list shows up three times in a row
	 */
	public static boolean taskSix (ArrayList<Integer> arr)
	{
		System.out.print("Task 6: ");
		
		//for loop that checks every number in the array list. Stops at the third to last element because it would give an out of bounds error
		for (int i = 0; i < arr.size()-2; i++)
		{
			//if there are three consecutive numbers at any point
			if (arr.get(i) == arr.get(i+1) && arr.get(i) == arr.get(i+2))
			{
				return true;
			}
			
		}
		
		//returns false if there isn't an occurrence of three consecutive numbers
		return false;
	}
	
	/*
	 * Returns how many times a certain number appears in an array list
	 */
	public static int taskSeven (ArrayList<Integer> arr, int x)
	{
		System.out.print("Task 7: ");
		
		//Keeps track of how many times the number shows up in the array
		int count = 0;
		
		//for loop that goes through every number in the array
		for (int i = 0; i < arr.size(); i++)
		{
			//Adds 1 to the count variable if the number that the for loop is checking is equal to the passed number
			if (arr.get(i) == x)
			{
				count++;
			}
		}
		
		//returns the amount of times the passed number shows up in the array
		return count;
	}
	
	/*
	 * Prints an array list's backwards version
	 */
	public static ArrayList<Integer> taskEight (ArrayList<Integer> arr)
	{
		System.out.print("Task 8: ");
		
		//for loop that goes through every number in the array list
		for (int i = 0; i < arr.size()-(arr.size()/2); i++)
		{	
			//Swaps an element with the opposite element on the other side of the array
			int temp = arr.get(i);
			arr.set(i, arr.get(arr.size()-i-1));
			arr.set(arr.size()-i-1, temp);			
		}
		
		return arr;
	}
	
	/*
	 * Shifts every element in the array list to the right
	 */
	public static ArrayList<Integer> taskNine (ArrayList<Integer> arr)
	{
		System.out.print("Task 9: ");
		
		//Takes the last element in the array list and puts it at the beginning, making it look like the elements shifted
		arr.add(0, arr.remove(arr.size()-1));
		
		return arr;
	}
	
	/*
	 * Sorts an array list using selection sort
	 */
	public static ArrayList<Integer> taskTen (ArrayList<Integer> arr)
	{
		System.out.print("Task 10: ");
		
		boolean sort = false;
		int counter = 0;
		
		while (sort == false)
		{
			sort = true;
			
			for (int i = counter; i < arr.size(); i++)
			{
				//if the number at index "counter" is greater than the number next to it
				if (arr.get(counter) >= arr.get(i))
				{
					//Swaps the number at index "counter" with the 
					int temp = arr.get(i);
					arr.set(i, arr.get(counter));
					arr.set(counter, temp);
					
					sort = false;
				}
			}
			
			//Adds 1 to counter; makes the for loop start at the next index and leaves the previous index alone 
			//because the correct number has just been put there
			counter++;
		}
		
		//returns the altered array list
		return arr;
	}

}
